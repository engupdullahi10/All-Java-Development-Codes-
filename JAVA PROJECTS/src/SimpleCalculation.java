import java.util.Scanner;
public class SimpleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter an operator (+ , - , * , /): ");
        char op = input.next().charAt(0);

        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    input.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                input.close();
                return;
        }

        System.out.println("\nResult: " + result);
        System.out.println("Simple Output:");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Operator: " + op);
        System.out.println("Result: " + result);

        input.close();
    }
}
