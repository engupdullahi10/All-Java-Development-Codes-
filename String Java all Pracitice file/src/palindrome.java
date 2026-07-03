import java.util.Scanner;

public class palindrome {
    // Word for palindrome check it and if its palindrome or not palindrome
    static boolean isPalindrome(String word){
        String reversed= "";
        for (int i=word.length()-1; i>=0; i--){
            reversed +=word.charAt(i);
        }
        if (word.equalsIgnoreCase(reversed)){
            System.out.println("It is a palindrome. ");
            return  true;
        }else {
            System.out.println("It is not a palindrome. ");
            return  false ;
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String words= input.nextLine();
        isPalindrome(words);
    }

}
