import java.util.Scanner;

public class uppercase {
    //Task 03: Convert character array to uppercase
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word: " );
        String word=input.nextLine();
        System.out.println("Uppercase word: " + word.toUpperCase());
    }
}
