import java.util.Scanner;
public class Task9 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= input.nextInt();
        int originalNumber=number;
        int reverses= 0;
        while (number!=0){
            int digit= number * 10;
            reverses = reverses * 10 + digit;
            number /= 10;
        }
        if (originalNumber==reverses){
            System.out.println("Palindrome: ");
        }else {
            System.out.println("Not Palindrome: ");
        }
        input.close();

    }
}
