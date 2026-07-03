import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ResultSystemCopy {

    static class Student {
        private String name;
        private String id;
        private ArrayList<Integer> marks = new ArrayList<>();

        public Student(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public void addMark(int mark) {
            marks.add(mark);
        }

        public double getAverage() {
            int sum = 0;
            for (int m : marks) sum += m;
            return (double) sum / marks.size();
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
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
            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter student ID: ");
            String id = input.nextLine();

            Student student = new Student(name, id);

            System.out.print("Enter number of subjects: ");
            int subjects = input.nextInt();

            if (subjects <= 0) throw new IllegalArgumentException("Invalid subject count");

            for (int i = 0; i < subjects; i++) {
                System.out.print("Enter mark " + (i + 1) + ": ");
                int mark = input.nextInt();

                if (mark < 0 || mark > 100)
                    throw new IllegalArgumentException("Marks must be 0–100");

                student.addMark(mark);
            }

            double avg = student.getAverage();
            char grade = checkGrade(avg);
            double gpa = calculateGpa(grade);

            System.out.println("\n----- STUDENT REPORT -----");
            student.displayInfo();
            System.out.println("Average: " + avg);
            System.out.println("Grade: " + grade);
            System.out.println("GPA: " + gpa);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
