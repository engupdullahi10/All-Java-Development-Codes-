import java.util.Scanner;
public class CharacterCounter {
    //Task 02: Character Counter
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=input.nextLine();
        System.out.println("Number of characters: " + word.length());
    }
}
