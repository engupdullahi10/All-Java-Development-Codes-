import java.util.Scanner;
public class Task1 {
    //Task 01: Factorial Calculator (Recursion)
    public static int factorial(int num){
        if (num==0||num==1){
            return 1;
        }
        return num * factorial(num - 1);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        int Factorial=factorial(number);
        System.out.println("Factorial of " + number + " = " + Factorial);
    }
}