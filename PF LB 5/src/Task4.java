import java.util.Scanner;
public class Task4{
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reversed += str.charAt(i);
        return str.equals(reversed);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        if (isPalindrome(text))
            System.out.println(text + "  Palindrome");
        else
            System.out.println(text + " Not a Palindrome");
        input.close();

    }
}
