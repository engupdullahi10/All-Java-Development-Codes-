import java.util.Scanner;
public class Task8 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        int fact= 1;
        int i= 1;
        while (i<=num){
            fact *= i;
            i++;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
        input.close();
    }
}
