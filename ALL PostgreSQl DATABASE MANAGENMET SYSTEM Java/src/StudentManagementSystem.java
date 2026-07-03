import java.util.*;

// Student Class
class Student {
    private int id;
    private String name;
    private String email;
    private ArrayList<String> enrolledCourses;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enrolledCourses = new ArrayList<>();
    }

    // Enroll in a course
    public void enrollCourse(String courseName) {
        enrolledCourses.add(courseName);
    }

    // Display student details
    public void showDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
        System.out.println("Enrolled Courses: " + enrolledCourses);
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }
}

// Main Management System
public class StudentManagementSystem {

    private static ArrayList<Student> students = new ArrayList<>();
    private static HashSet<String> uniqueEmails = new HashSet<>();
    private static HashMap<Integer, String> courses = new HashMap<>();

    public static void main(String[] args) {

        // Initialize courses
        courses.put(101, "Java");
        courses.put(102, "Database");
        courses.put(103, "Data Structures");

        // Add students
        addStudent(1, "Ali", "ali@gmail.com");
        addStudent(2, "Ahmed", "ahmed@gmail.com");
        addStudent(3, "Ali2", "ali@gmail.com"); // duplicate email, should be blocked

        // Enroll students in courses
        enrollStudentInCourse(1, 101);
        enrollStudentInCourse(1, 102);
        enrollStudentInCourse(2, 103);

        // Display all students
        displayAllStudents();
    }

    // Add a student (with unique email check)
    public static void addStudent(int id, String name, String email) {
        if (uniqueEmails.contains(email)) {
            System.out.println("❌ Email already exists: " + email);
            return;
        }

        Student student = new Student(id, name, email);
        students.add(student);
        uniqueEmails.add(email);
    }

    // Enroll a student in a course
    public static void enrollStudentInCourse(int studentId, int courseId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            String courseName = courses.get(courseId);
            if (courseName != null) {
                student.enrollCourse(courseName);
            }
        }
    }

    // Find a student by ID
    private static Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Display all students and their courses
    public static void displayAllStudents() {
        for (Student s : students) {
            s.showDetails();
            System.out.println("-------------------------");
        }
    }
}