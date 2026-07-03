//SIMPLE CALCULATION MATHS
//Simple Project for First Project in Java.
// It's
import java.util.Scanner;
public class Simple_project {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter the first number: ");
            double num1=input.nextDouble();
            System.out.println("Enter the second number: ");
            double  num2=input.nextDouble();
            System.out.println("Enter an operators ( + , - , / , * ): ");
            char operator=input.next().charAt(0);
            double result;
            switch (operator){
                case '+':
                    result=num1 + num2 ;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result=num1 - num2 ;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result= num1 * num2 ;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 !=0){
                        result= num1 / num2 ;
                        System.out.println("Result: " + result);

                    }else {
                        System.out.println("The error of division by zero is not allowed: ");
                    }
                    break;
                default:
                    System.out.println("Please enter an operator but not a number: ");
            }
            System.out.println("Do you want to perform another calculation? (y/n): ");
            choice=input.next().charAt(0);

        }while (choice=='y' || choice=='Y');
        System.out.println("Calculation over. Goodbye! ");
        System.out.println("Eng Abdullahi!");
        input.close();
    }
}
