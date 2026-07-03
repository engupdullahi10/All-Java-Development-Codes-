import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        // Reverse Numbers
        Scanner input=new Scanner(System.in);
        int reverse=0;
        System.out.print("Enter the a number: ");
        int num=input.nextInt();
        while (num!=0){
            int digit=num / 10;
            reverse=reverse * 10 + digit;
            num=num / 10;
        }
        System.out.println("Reverse number = " + reverse);
    }
}
