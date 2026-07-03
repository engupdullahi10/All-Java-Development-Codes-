import java.util.Scanner;
public class Task1 {
    //Task 01: Factorial Calculator (Recursion)
    public static int factorial(int n){
        if (n== 0 || n== 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        int result= factorial(num);
        System.out.println("Factorial number " + num + ": " + result);
    }
}