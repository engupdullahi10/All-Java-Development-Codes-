import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.println("Enter height in meters: ");
        double height = input.nextDouble();

        double BMI = weight / (height * height);
        String category;

        if (BMI < 18.5) {
            category = "Underweight";
        } else if (BMI >= 18.5 && BMI < 25) {
            category = "Normal";
        } else if (BMI >= 25 && BMI < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        System.out.println("Simple Output:");
        System.out.println("BMI: " + BMI);
        System.out.println("Category: " + category);

        input.close();
    }
}
