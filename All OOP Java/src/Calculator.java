import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
    public double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed.");
        }
        return a % b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Calculator Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice;
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
                continue;
            }
            if (choice == 6) {
                System.out.println("Exiting... Goodbye!");
                break;
            }
            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice. Please select 1-6.");
                continue;
            }
            try {
                System.out.print("Enter first number: ");
                double firstNumber = input.nextDouble();
                System.out.print("Enter second number: ");
                double secondNumber = input.nextDouble();
                double result = 0;
                switch (choice) {
                    case 1:
                        result = calculator.add(firstNumber, secondNumber);
                        break;
                    case 2:
                        result = calculator.subtract(firstNumber, secondNumber);
                        break;
                    case 3:
                        result = calculator.multiply(firstNumber, secondNumber);
                        break;
                    case 4:
                        result = calculator.divide(firstNumber, secondNumber);
                        break;
                    case 5:
                        result = calculator.modulus(firstNumber, secondNumber);
                        break;
                }
                System.out.println("Result: " + result);
            } catch (InputMismatchException e) {
                System.out.println("Invalid number input.");
                input.next();
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        input.close();
    }
}