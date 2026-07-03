import java.util.Scanner;
public class Task3 {
    //Task 03: Recursive Sum of Numbers
    public static int sum(int n){
        if (n==0|| n==1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        int result=sum(number);
        System.out.println("Sum of numbers from 1 to " + number + " is : " + result);
    }
}
