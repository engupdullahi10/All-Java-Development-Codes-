import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class App {

    public static String CalculateGrade(double aver) {
        if (aver >= 90) {
            return "A";
        } else if (aver >= 80) {
            return "B";
        } else if (aver >= 70) {
            return "C";
        } else if (aver >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student ID: ");
        int id = input.nextInt();

        System.out.print("Enter how many subjects: ");
        int sub = input.nextInt();

        int total = 0;

        for (int i = 0; i < sub; i++) {
            System.out.print("Enter marks " + (i + 1) + ": ");
            int marks = input.nextInt();
            total += marks;
        }

        double aver = (double) total / sub;
        String grade = CalculateGrade(aver);

        // Display Result
        System.out.println("\n=== Output For The Result ===");
        System.out.println("Student name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Average marks: " + aver);
        System.out.println("Grade: " + grade);

        String outputFile = "result.txt";

        try {
            FileWriter fw = new FileWriter(outputFile);

            fw.write("ID , Name , Average , Grade\n");
            fw.write(id + " , " + name + " , " + aver + " , " + grade);

            fw.close();

            System.out.println("Result saved to file.");

        } catch (Exception e) {
            System.out.println("Error writing file");
        }

        input.close();
    }
}