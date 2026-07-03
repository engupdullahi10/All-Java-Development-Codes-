import java.util.Scanner;
public class PalindromeName {
    // Palindrome Name
    public static boolean isPalindrome(String name){
        if (name==null){
            return false;
        }
        name=name.toLowerCase();
        String reverse= "";
        for (int i=name.length() - 1; i>=0 ; i--){
            reverse= reverse + name.charAt(i);
        }
        return name.equals(reverse);
    }
}
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name=input.nextLine();
        if (PalindromeName.isPalindrome(name)){
            System.out.println("It is found the Palindrome name .");
        }else {
            System.out.println("Not found the  Palindrome name.");
        }

}
