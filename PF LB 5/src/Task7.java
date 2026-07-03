import java.util.Scanner;
public class Task7{
    static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Simple Output. ");
        System.out.println("Number: " + num);
        System.out.println("Reversed number: " + reverseNumber(num));
        input.close();
    }
}
