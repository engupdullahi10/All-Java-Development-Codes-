
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        //Even or Odd Checker
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

    }
}