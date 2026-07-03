//BASIC PROJECT IN JAVA.
//SIMPLE CALCULATION.
import java.util.Scanner;
public class false2 {
    public  static  void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=input.nextInt();
        System.out.println("Enter the second number: ");
        int num2=input.nextInt();
        System.out.println("Enter an operator (+ , - , * , /): ");
        char  op=input.next().charAt(0);
        int result= 0;
        switch (op){
            case '+':
            result= num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result= num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result= num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2!=0){
                    result= num1 / num2;
                    System.out.println("Result: " + result);

                }else {
                    System.out.println("The division zero is not allowed. ");
                }
                break;
            default:
                System.out.println("Invalid an operator.");

        }
        System.out.println("Simple OutPut. ");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Operator: " + op);
        System.out.println("Result: " + result);
        input.close();
    }
}
