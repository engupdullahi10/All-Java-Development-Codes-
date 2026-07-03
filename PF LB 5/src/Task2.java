import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Scanner;

public class Task2{
    static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    static double compoundInterest(double p, double r, double t) {
        return p * Math.pow((1 + r / 100), t) - p;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = input.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r = input.nextDouble();
        System.out.print("Enter Time (in years): ");
        double t = input.nextDouble();
        System.out.println("Simple OutPut. ");
        System.out.println("Simple Interest = " + simpleInterest(p, r, t));
        System.out.println("Compound Interest = " + compoundInterest(p, r, t));
        input.close();
    }
}
