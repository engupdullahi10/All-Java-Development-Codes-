import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Students{
    private String name;
    private int id;
    private HashMap<String , Integer>  marks;
    public Students(){
        this.name="Unknow";
        this.id= 0;
        this.marks= new HashMap<>();
    }
    public Students(String name , int id){
        this.name=name;
        this.id=id;
        this.marks=new HashMap<>();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.isEmpty()){
            System.out.println("Name cannot be empty.");
            return;
        }
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        if (id<0){
            System.out.println("ID cannot be last than zero. ");
            return;
        }
        this.id=id;
    }
    public void addMark(String subject , int mark){
        if (mark<0 || mark>100){
            System.out.println("Invalid marks!.");
            return;
        }
        marks.put(subject , mark);
    }
    public double calculateAver(){
        int total=0;
        for (int mark: marks.values()){
            total+=mark;
        }
        return marks.isEmpty() ? 0: (double) total / marks.size();
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total marks: " + marks);
        System.out.println("Average: " + calculateAver());
    }
}
public class StudentManagementSystem {
    //Mini Project  Student Management System
    static ArrayList<Students> students=new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int choice;
        do {
            System.out.println("\n=====Student Management System=====");
            System.out.println("1. Add Student: ");
            System.out.println("2. Add Marks: ");
            System.out.println("3. Display All Student: ");
            System.out.println("4. Search Student ID: ");
            System.out.println("5. Exit:  ");
            System.out.println("Enter your choice: ");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    AddStudent();
                    break;
                case 2:
                    AddMarks();
                    break;
                case 3:
                    DisplayAllStudent();
                    break;
                case 4:
                    SearchStudentId();
                    break;
                case 5:
                    System.out.println("Exit the program.");
                    break;
                default:
                    System.out.println("Invalid Choice ");
            }
        }while (choice!=5);
    }
    //ADD STUDENT NAME & ID:
    public static void AddStudent(){
        input.nextLine();
        System.out.println("Enter the student name: ");
        String name=input.nextLine();
        System.out.println("Enter the student ID: ");
        int id=input.nextInt();
        students.add(new Students(name , id));
        System.out.println("Student added successfully!");
    }
    // ADD MARKS
    public static void AddMarks(){
        System.out.println("Enter the student ID: ");
        int id=input.nextInt();
        input.nextLine();
        for (Students s: students){
            if (s.getId()==id){
                System.out.println("Enter subjects: ");
                String subject=input.nextLine();
                System.out.println("Enter marks: ");
                int mark=input.nextInt();
                s.addMark(subject , mark);
                System.out.println("Marks Added!. ");
                return;
            }
        }
        System.out.println("Students Not found. ");
    }
    //DISPLAY ALL STUDENTS
    public static void DisplayAllStudent(){
        if (students.isEmpty()){
            System.out.println("Student not found in the system.");
            return;
        }
        for (Students s: students){
            s.display();
        }
    }
    //SEARCH STUDENT ID:
    public static void SearchStudentId(){
        System.out.println("Enter your student ID: ");
        int id=input.nextInt();
        for (Students s: students){
            if (s.getId()==id){
                s.display();
                return;
            }
            System.out.println("Student not  found. ");
        }
    }
}
