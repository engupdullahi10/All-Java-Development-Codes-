import java.util.Scanner;

public class PalindromeNumber {
    // Palindrome Number
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num ;
        int original;
         int reverse=0;
        System.out.print("Enter the a number: ");
        num=input.nextInt();
        original=num;
        while (num!=0){
            int digit=num % 10;
            reverse=reverse * 10 + digit;
            num=num / 10;
        }
        if (original== reverse){
            System.out.println("Palindrome number");
        }else {
            System.out.println("Not Palindrome number");
        }
    }
}
