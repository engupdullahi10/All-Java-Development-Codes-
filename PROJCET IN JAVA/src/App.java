import  java.util.Scanner;
public class App {
    public  static void  main(String[] args){
        Scanner input=new Scanner(System.in);
        // Ask the user two number
        System.out.println("Enter the first number: ");
        double num1=input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2=input.nextDouble();
        double sum= num1 + num2 ;
        System.out.println("The result is: " + sum);
        input.close();
    }
}
