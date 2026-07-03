import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Task12 {
    // Case Study: University Student Portal
    static Scanner input=new Scanner(System.in);
    //student management
    static int[] studentId=new int[50];
    static String[] studentName=new String[50];
    static  String[] department=new String[50];
    static  String[] email=new String[50];
    static int[] age=new int[50];
    static  int studentCount= 0;
    //course management
    static int[] courseCode=new int[25];
    static String[] courseTitle=new String[25];
    static int[] creditHours=new int[25];
    static String[] instructor=new String[25];
    static int courseCount= 0;
    //enrollment system & grades
    static int[][] enrollment=new int[50][25];
    static double[][] grade=new double[50][25];
    public  static void main(String[] args){
        loadStudent();
        menu();
    }
    // Menu
    public static void menu(){
        int choice;
        while (true){
            System.out.println("\n===== UNIVERSITY PORTAL =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student");
            System.out.println("4. Record Grade");
            System.out.println("5. View Reports");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1: addStudent(); break;
                case 2: addCourse(); break;
                case 3: enrollStudent(); break;
                case 4: recordGrade(); break;
                case 5: reportsMenu(); break;
                case 6:
                    saveStudents();
                    System.out.println("Data saved. Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    // Add Student
    public static void addStudent(){
        System.out.println("Enter student id: ");
        studentId[courseCount]=input.nextInt();
        input.nextLine();
        System.out.println("Enter student name: ");
        studentName[courseCount]=input.nextLine();
        System.out.println("Enter student department: ");
        department[courseCount]=input.nextLine();
        System.out.println("Enter student email: ");
        email[courseCount]=input.nextLine();
        System.out.println("Enter student age: ");
        age[courseCount]=input.nextInt();
        studentCount++;
        System.out.println("Student Added Successfully.");
    }
    // Find the index of the Student
    public static int findStudentIndex(int id){
        for (int i=0; i<studentCount; i++){
            if (studentId[i]== id){
                return i;
            }
        }
        return -1;
    }
    // Course
    public static void addCourse(){
        System.out.println("Enter the course code: ");
        courseCode[courseCount]=input.nextInt();
        input.nextLine();
        System.out.println("Enter the course title: ");
        courseTitle[courseCount]=input.nextLine();
        System.out.println("Enter the course credit hours: ");
        creditHours[courseCount]=input.nextInt();
        input.nextLine();
        System.out.println("Enter the course instructor: ");
        instructor[courseCount]=input.nextLine();
        courseCount++;
        System.out.println("Courses Added Successfully.");
    }
    // Find the index of the course
    public static int findCourseIndex(int code){
        for (int i=0; i<courseCount; i++){
            if (courseCode[i]==code){
                return i;
            }
        }
        return - 1;
    }
    // Add the enrollment course
    public static void enrollStudent(){
        // find index student
        System.out.println("Enter the student ID: ");
        int id=input.nextInt();
        input.nextLine();
        int sIndex=findStudentIndex(id);
        if (sIndex== - 1){
            System.out.println("Student Not Found.");
            return;
        }
        // find index course
        System.out.println("Enter the course code: ");
        int code=input.nextInt();
        input.nextLine();
        int cIndex=findCourseIndex(code);
        if (cIndex== - 1){
            System.out.println("Course Not Found");
            return;
        }
        enrollment[sIndex][cIndex]= 1;
        System.out.println("Student Enrolled Successfully.");
    }
    // Grade
    public static void recordGrade() {
        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine();

        int sIndex = findStudentIndex(id);
        if (sIndex == -1) {
            System.out.println("Student Not Found.");
            return;
        }
        System.out.print("Enter Course Code: ");
        int code = input.nextInt();
        int cIndex = findCourseIndex(code);
        if (cIndex == -1) {
            System.out.println("Course Not Found.");
            return;
        }
        System.out.print("Enter Grade (0.0 - 4.0): ");
        grade[sIndex][cIndex] = input.nextDouble();
        System.out.println("Grade Recorded.");
    }
    // Calculate CGPA
    public static double calculateGPA(int sIndex) {
        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < courseCount; i++) {
            if (enrollment[sIndex][i] == 1) {
                totalPoints += grade[sIndex][i] * creditHours[i];
                totalCredits += creditHours[i];
            }
        }

        if (totalCredits == 0)
            return 0;

        return totalPoints / totalCredits;
    }
    // reportsMenu
    public static void reportsMenu() {
        System.out.println("1. Course with Highest Enrollment");
        System.out.println("2. Students with 5 or More Courses");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: highestEnrollmentCourse();
            break;
            case 2: studentsWithFiveCourses();
            break;
        }
    }
    // highestEnrollmentCourse()
    public static void highestEnrollmentCourse() {
        int max = 0;
        int index = -1;

        for (int i = 0; i < courseCount; i++) {
            int count = 0;
            for (int j = 0; j < studentCount; j++) {
                if (enrollment[j][i] == 1)
                    count++;
            }

            if (count > max) {
                max = count;
                index = i;
            }
        }

        if (index != -1)
            System.out.println("Highest Enrollment: " + courseTitle[index] + " (" + max + " students)");
    }
    // studentsWithFiveCourses()
    public static void studentsWithFiveCourses() {
        for (int i = 0; i < studentCount; i++) {
            int count = 0;
            for (int j = 0; j < courseCount; j++) {
                if (enrollment[i][j] == 1)
                    count++;
            }

            if (count >= 5) {
                System.out.println(studentName[i]);
            }
        }
    }
    // Sava Student
    public static void saveStudents() {
        try {
            FileWriter fw = new FileWriter("students.txt");
            for (int i = 0; i < studentCount; i++) {
                fw.write(studentId[i] + ", " +
                        studentName[i] + ", " +
                        department[i] + ", " +
                        email[i] + ", " +
                        age[i] + "\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("Error Saving Students.");
        }
    }
    public static void loadStudent() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                studentId[studentCount] = Integer.parseInt(data[0]);
                studentName[studentCount] = data[1];
                department[studentCount] = data[2];
                email[studentCount] = data[3];
                age[studentCount] = Integer.parseInt(data[4]);
                studentCount++;
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error load student");
        }
    }
}
