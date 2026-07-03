import java.util.Scanner;

public class CharacterSearchWord {
    //Task 05: Character Search Tool
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=input.nextLine();
        System.out.println("Enter a character to search: ");
        char search=input.next().charAt(0);
        boolean found=false;
        char[] chars=word.toCharArray();
        for (int i=0; i<chars.length;i++){
            if (chars[i]==search){
                found= true;
                break;
            }
        }
        if (found){
            System.out.println("Character " + search + " exites in the word. ");
        }else {
            System.out.println("Character " + search + " does NOT exites in the word.");
        }
    }
}
