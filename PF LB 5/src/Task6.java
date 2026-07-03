import java.util.Scanner;
public class Task6{
    static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double w = input.nextDouble();
        System.out.print("Enter height (m): ");
        double h = input.nextDouble();

        double bmi = calculateBMI(w, h);
        //System.out.println("BMI Value: " + String.format("%.2f", bmi));
        String Category;

        if (bmi < 18.5) {
            Category= "Underweight";
        }
        else if (bmi < 25) {
            Category= "Normal";
        }
        else if (bmi < 30) {
            Category= "Overweight";
        }
        else {
            Category= "Obese";
        }
        System.out.println("Simple OutPt. ");
        System.out.println("BMI: " + bmi);
        System.out.println("weight: " + w);
        System.out.println("Height: " + h);
        System.out.println("Category: " + Category);
        input.close();

    }
}
