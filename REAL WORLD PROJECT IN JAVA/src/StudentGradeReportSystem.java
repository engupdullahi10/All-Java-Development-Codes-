import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeReportSystem {

    static class Student {
        private String studentName;
        private String studentId;
        private ArrayList<Integer> results = new ArrayList<>();

        public Student(String studentName, String studentId) {
            this.studentName = studentName;
            this.studentId = studentId;
        }

        public void addResult(int mark) {
            results.add(mark);
        }

        public double average() {
            int sum = 0;
            for (int m : results) {
                sum += m;
            }
            return (double) sum / results.size();
        }

        public void displayInfo() {
            System.out.println("Name: " + studentName);
            System.out.println("ID: " + studentId);
        }
    }

    public static char checkGrade(double avg) {
        if (avg >= 90) return 'A';
        if (avg >= 80) return 'B';
        if (avg >= 70) return 'C';
        if (avg >= 60) return 'D';
        return 'F';
    }

    public static double calculateGpa(char grade) {
        switch (grade) {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
            default: return 0.0;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("WELCOME TO STUDENT GRADE REPORT SYSTEM");

            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter student ID: ");
            String id = input.nextLine();

            Student student = new Student(name, id);

            System.out.print("Enter total number of subjects: ");
            int totalSubject = input.nextInt();

            if (totalSubject <= 0)
                throw new IllegalArgumentException("Subjects must be greater than zero");

            for (int i = 0; i < totalSubject; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                int mark = input.nextInt();

                if (mark < 0 || mark > 100)
                    throw new IllegalArgumentException("Marks must be between 0 and 100");

                student.addResult(mark);
            }

            double average = student.average();
            char grade = checkGrade(average);
            double gpa = calculateGpa(grade);

            System.out.println("\n----- STUDENT GRADE REPORT -----");
            student.displayInfo();
            System.out.println("Subjects Taken: " + totalSubject);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);
            System.out.println("GPA: " + gpa);

            if (gpa < 2.0)
                System.out.println("Status: Warning – Academic Probation");
            else
                System.out.println("Status: Satisfactory");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Numbers only.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
