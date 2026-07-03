import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks 1: ");
        int mark1 = input.nextInt();

        System.out.print("Enter marks 2: ");
        int mark2 = input.nextInt();

        System.out.print("Enter marks 3: ");
        int mark3 = input.nextInt();

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}