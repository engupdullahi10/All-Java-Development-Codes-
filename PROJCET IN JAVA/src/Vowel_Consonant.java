//3. Check if a Character is a Vowel or Consonant
//🧠 Logic:
//
//Vowels are: a, e, i, o, u (both uppercase and lowercase).

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char letter=input.next().charAt(0);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
            System.out.println("It is a vowel: ");
        }
        else{
            System.out.println("It is not a vowel but are consonant: ");
        }
        input.close();
    }
}
