import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private String name;
    private  String rollNo;
    private int age;
    private int marks;
    public Student(){
        name="Unknown";
        rollNo= "Unknown";
        age= 0;
        marks= 0;
    }
    public Student(String name , String rollNo , int age , int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
        this.marks=marks;
    }
    // Setter & Getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name.isEmpty()){
            System.out.println("The student is not found in the system.");
        }else {
            this.name = name;
        }
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        if (rollNo==null || rollNo.isEmpty()){
            System.out.println("The roll number of the student is not  found in the system.");
        }else {
        this.rollNo = rollNo;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("The student age is not found in the system.");
        }else {
        this.age = age;
        }
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks<=0 || marks>=100){
            System.out.println("The marks of the student between 0 t0 100.");
        }else {
        this.marks = marks;
        }
    }
    // Calculate the average
    public static String calculateAver(double aver){
        if (aver>=90){
            return "A";
        } else if (aver>=80) {
            return "B";
        } else if (aver>=70) {
            return "C";
        } else if (aver>=60) {
            return "D";
        }else {
            return "F";
        }
    }
    // Show student Details
    public void showStudentDetails(){
        System.out.println("\n====Student Management System Of The Result====");
        System.out.println("Student name: " + name);
        System.out.println("Student RollNo: " + rollNo);
        System.out.println("Student age: " + age);
        System.out.println("Student Marks: " + marks);
    }
}
public class StudentGradeManagement {
    // Student Grade Management System
    static ArrayList<Student> students=new ArrayList<>();
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To Student Management System.");
        System.out.print("Enter the student name: ");
        String name=input.nextLine();
        System.out.print("Enter the student ID: ");
        String id=input.nextLine();
        System.out.print("Enter the student age: ");
        int age=input.nextInt();
        System.out.print("Enter the number of the subjects: ");
        int sub=input.nextInt();
        int totalMark=0 ;
        for (int i=0; i<sub;i++){
            System.out.println("Enter the marks of the subjects " + (i + 1) + " : ");
            int marks=input.nextInt();
            totalMark+=marks;
        }
        double aver=(double) totalMark / sub;
        String grade= Student.calculateAver(aver);
        System.out.println("Average :" + aver);
        System.out.println("Student Grade: " + grade);
        Student student=new Student(name , id , age , (int) aver);
        // Student Data List
        students.add(student);
        // Save Data For Student
        SaveData();
        // Read Data For Student
        ReadData();
        // Display Info Of The Student
        student.showStudentDetails();
    }
    // // Save Data For Student
    public static void SaveData(){
        try {
            FileWriter fw=new FileWriter("student.txt");
            for (Student s: students){
                fw.write("Student name: " + s.getName()
                        + "\n" + "Student ID: "  + s.getRollNo()
                        + "\n" + "Student age: "  + s.getAge()
                        + "\n"  + "Student marks: " + s.getMarks() + "\n");
            }
            System.out.println("Student data save successfully");
            fw.close();
        }catch (IOException e){
            System.out.println("Error data student");
        }
    }
    // Read data file student
    public static void ReadData(){
        try {
            FileReader fr=new FileReader("student.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while ((line=br.readLine())!=null){
                String[] data=line.split(" , ");
                if (data.length==4){
                    System.out.println("Student name:" +data[0].trim());
                    System.out.println("Student ID:" +data[1].trim());
                    System.out.println("Student age: " +data[2].trim());
                    System.out.println("Student marks: " +data[3].trim());
                }
            }
            fr.close();
            br.close();
        }catch (IOException e){
            System.out.println("Error student file ");
        }
    }
}
