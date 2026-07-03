import java.util.Scanner;
public class ReverseWordsAndCheckPalindrome {
    public  static void  main(String[] args){
        //: Reverse Words and Check Palindrome
        Scanner input=new Scanner(System.in);
        System.out.println("Enter string name: ");
        String name=input.nextLine();
        String  reversedWord= "";
        name= name.toLowerCase();
        for (int i=name.length()-1; i>=0; i--){
            reversedWord+= name.charAt(i);
            }
            if (name.equalsIgnoreCase(reversedWord)){
                System.out.println("Palindrome ");
            }else {
                System.out.println("Not Palindrome ");
            }

        System.out.println("SIMPLE OUTPUT : ");
        System.out.println("String Name: " + name);
        System.out.println("Reversed Word: " + reversedWord);
        input.close();

    }
}
