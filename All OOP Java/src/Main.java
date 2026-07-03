//Class Student
class Student{
    private int studentId;
    private String name;
    private String course;
    private boolean isEnrolled;
    private static int totalStudent=0;
    //Default Construction
    public Student(){
        this.studentId=0;
        this.name="Unknown";
        this.course="Unknown";
        this.isEnrolled=true;
        totalStudent++;
    }
    // Construction
    public Student(int studentId , String name , String course ,boolean isEnrolled){
        this.studentId=studentId;
        this.name=name;
        this.course=course;
        this.isEnrolled=isEnrolled;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }

    public static void setTotalStudent(int totalStudent) {
        Student.totalStudent = totalStudent;
    }
    // Enrolled the course
    public void enrolled(){
        if (isEnrolled){
            isEnrolled=true;
            System.out.println(name + " has been enrollment for the course");
        }else {
            System.out.println(name + " has been not enrollment for the course");
        }
    }
    public void Enrollment(){
        if (isEnrolled){
            isEnrolled=false;
            System.out.println(name + " has been dropped the course.");
        }else {
            System.out.println(name + " has been not dropped the course. ");
        }
    }
    //Display Inform
    public void displayInform(){
        System.out.println("\n===Show Student Details====");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student name: " + name);
        System.out.println("Student Courses: " + course);
        System.out.println("Student Enrolled: " + isEnrolled);
    }
    // Show Total Student
    public static void showTotalStudent(){
        System.out.println("Total Student : " + totalStudent);
    }
}
public class Main {
    //✅ Task 1: Student Management System
    public static void main(String[] args){
        System.out.println("\nWelcome To Student Management System");
        Student student1=new Student(101 , "Abdullahi " , "Java" , true);
        Student student2=new Student(102 , "Hafso" , "Python" , true);
        Student student3=new Student(103 , "Zamzam" , "Java" , false);
        //Show Details
        student1.displayInform();
        student2.displayInform();
        student3.displayInform();
        //Enrollment
        student1.enrolled();
        student1.Enrollment();
        //Total Student
        System.out.println("\nShow Total Student Management System");
        Student.showTotalStudent();
    }

}
