import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentGradeReportSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME TO STUDENT GRADE REPORT SYSTEM");

        System.out.print("Enter the name of the student: ");
        String studentName = input.next();

        System.out.print("Enter the student ID: ");
        String studentID = input.next();

        int totalSubjects = 0;
        int totalMarks = 0;

        try {
            System.out.print("Enter total number of subjects taken: ");
            totalSubjects = input.nextInt();

            if (totalSubjects <= 0) {
                throw new ArithmeticException("Subjects cannot be zero or negative");
            }

            for (int i = 1; i <= totalSubjects; i++) {
                System.out.print("Enter marks for subject " + i + " (0–100): ");
                int marks = input.nextInt();

                if (marks < 0 || marks > 100) {
                    throw new IllegalArgumentException("Marks must be between 0 and 100");
                }
                totalMarks += marks;
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Numbers only.");
            return;
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        } finally {
            System.out.println("Processing completed...");
        }

        double average = (double) totalMarks / totalSubjects;

        char grade;
        if (average >= 90){
            grade = 'A';
        }
        else if (average >= 80){
            grade = 'B';
        }
        else if (average >= 70){
            grade = 'C';
        }
        else if (average >= 60) grade = 'D';

        else{
            grade = 'F';
        }

        double gpa;
        switch (grade) {
            case 'A': gpa = 4.0;
            break;
            case 'B': gpa = 3.0;
            break;
            case 'C': gpa = 2.0;
            break;
            case 'D': gpa = 1.0;
            break;
            default:  gpa = 0.0;
        }

        System.out.println("\n--- STUDENT GRADE REPORT SUMMARY ---");
        System.out.println("Student Name   : " + studentName);
        System.out.println("Student ID     : " + studentID);
        System.out.println("Subjects Taken : " + totalSubjects);
        System.out.println("Total Marks    : " + totalMarks);
        System.out.println("Average Marks  : " + average);
        System.out.println("Grade          : " + grade);
        System.out.println("GPA            : " + gpa);

        if (gpa < 2.0)
            System.out.println("Status : Warning - Academic Probation");
        else
            System.out.println("Status : Satisfactory");
        input.close();
    }
}
