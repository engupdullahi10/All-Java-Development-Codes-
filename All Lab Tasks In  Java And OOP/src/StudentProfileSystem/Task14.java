package StudentProfileSystem;
import java.util.Scanner;
// Class Student
class Students{
    private String name;
    private  int id;
    private double gpa;
    private String department;
    private boolean isEnrolled;
    // Default Constructor
    public Students(){
        name= "Unknown";
        id= 0;
        gpa= 0;
        department= "null";
        isEnrolled= true;
    }
    // Overloading Construction
    public Students(String name , int id , double gpa , String department , boolean isEnrolled){
        this.name=name;
        this.id=id;
        this.gpa=gpa;
        this.department=department;
        this.isEnrolled=isEnrolled;
    }
    // Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }
    // Method
    public void enrolled(){
        isEnrolled=true;
    }
    public void updateGpa(double newGpa){
        gpa=newGpa;
        System.out.println("Update Gpa is: " + gpa);
    }
    // Method Overloading
    public void newGpa(double quiz , double min , double fin){
        gpa=(quiz + min + fin) / 25;
    }
    public void updateDepartment(String newDepartment){
        department=newDepartment;
        System.out.println("Update the department: " + department);
    }
    protected void displayAcademicStatus(){
        if (gpa>= 3.5){
            System.out.println("Status: Excellent");
        } else if (gpa>=3.0) {
            System.out.println("Status: Good");
        } else if (gpa>=2.0) {
            System.out.println("Status: Average");
        }else {
            System.out.println("Status: Poor");
        }
    }
    // Show Student Details
    public void showStudentDetails(){
        System.out.println("\n===Show Student Details For The Result====");
        System.out.println("Student name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student GPA: " + gpa);
        System.out.println("Student Department: " + department);
        System.out.println("Student Enrolled: " +isEnrolled);
    }

    public void newGpa(double newGPA) {
    }
}
public class Task14 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name=input.nextLine();
        System.out.print("Enter student ID: ");
        int id=input.nextInt();
        System.out.print("Enter student GPA: ");
        double gpa=input.nextDouble();
        input.nextLine();
        System.out.print("Enter student department: ");
        String department=input.nextLine();
        System.out.print("Enter student enrolled(true & false:  ");
        boolean enrolled=input.nextBoolean();
        Students students=new Students(name , id , gpa ,department ,enrolled);
        students.displayAcademicStatus();
        students.enrolled();
        System.out.print("Enter student update GPA: ");
        double newGpa=input.nextDouble();
        students.updateGpa(newGpa);
        input.nextLine();
        System.out.print("Enter the student update department:");
        String newDepart=input.nextLine();
        students.updateDepartment(newDepart);
        System.out.print("Enter new GAP: ");
        double newGPA=input.nextDouble();
        students.newGpa(newGPA);
        students.showStudentDetails();
    }
}
