import java.util.Scanner;
public class StringCharacterAnalyzer {
    public  static  void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Read a string from the user: ");
        String read=input.nextLine();
        int consonantsCount= 0;
        int vowelCount= 0;
        read=read.toLowerCase();
        for (int i= 0; i<read.length(); i++){
            char ch=read.charAt(i);
            if (ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            } else if (ch>='a' && ch<='z') {
                consonantsCount++;
            }
        }
        System.out.println("SIMPLE OUTPUT: ");
        System.out.println("String Name: " + read);
        System.out.println("Total Vowel: " + vowelCount);
        System.out.println("Total Consonant: " + consonantsCount);
        input.close();
    }
}
