//Class Student
class Students{
    private int studentId;
    private String name;
    private char grade;
    static int totalStudent;
    //Static
    static {
        System.out.println("Student System Initialized");
        totalStudent=  0;
    }
    //Default Construction
    public Students(){
        this.studentId= 0;
        this.name= "Unknown";
        this.grade= 'A';
        totalStudent++;
    }
    //Method Construction
    public Students(int studentId , String name , char grade){
        this.studentId=studentId;
        this.name= name ;
        this.grade=grade;
        totalStudent++;
    }
    // Getter & Setter

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }

    public static void setTotalStudent(int totalStudent) {
        Students.totalStudent = totalStudent;
    }
    //Show Student Details & Inform
    public void displayInform(){
        System.out.println("\n===Show Student Details & Inform===");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student name: " + name);
        System.out.println("Student Grade: " + grade);
    }
    // Show Total Students
    public static void showTotalStudents(){
        System.out.println("Total Students: " + totalStudent);
    }
}
public class Task18 {
    //Task 1 Student Record System
    //Problem Statement:
    //Design a class to manage student information using encapsulation and static members
    public static void main(String[] args){
        //	Create 3 students
        Students s1=new Students(101 , "Abdullahi" , 'A');
        Students s2=new Students(102 , "Hafsa" , 'B');
        Students s3=new Students(103 , "Zamzam" , 'B');
        // Display all student inform
        s1.displayInform();
        s2.displayInform();
        s3.displayInform();
        // Show Total Student
        System.out.println("\nShow Total Student");
        Students.showTotalStudents();
    }
}
