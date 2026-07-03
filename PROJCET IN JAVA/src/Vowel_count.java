//🧠 Logic
//
//Take a string input from the user.
//
//Convert it to lowercase (to handle both uppercase and lowercase).
//
//Loop through each character of the string.
//
//Check if each character is a vowel (a, e, i, o, u).
//
//Count how many vowels appear.

import java.util.Locale;
import java.util.Scanner;

public class Vowel_count {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word or sentence: ");
        String txt=input.nextLine();
        int count= 0;
        txt=txt.toLowerCase();
        for (int i = 0 ; i < txt.length(); i++){
            char ch=txt.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("The number of the vowel is: " + count);
        input.close();
    }
}
