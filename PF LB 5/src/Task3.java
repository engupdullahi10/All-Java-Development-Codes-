import java.util.Scanner;
public class Task3{
    static String calculateGrade(int marks) {
        if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for Student " + i + ": ");
            int marks = input.nextInt();
            System.out.println("Student " + i + " → Marks: " + marks + " → Grade: " + calculateGrade(marks));
        }
        input.close();
    }
}
