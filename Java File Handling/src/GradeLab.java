import java.util.Scanner;
public class GradeLab {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word=input.nextLine();
        char[] arr=word.toCharArray();
        char longestChar= arr[0];
        int longestLength= 1;
        char currentChar=arr[0];
        int currentLength= 1;
        for (int i=0 ; i<arr.length; i++){
            if (arr[i]==currentChar){
                currentLength++;
            }else {
                currentChar=arr[i];
                currentLength= 1;
            }
            if (currentLength>longestLength){
                longestLength=currentLength;
                longestChar=currentChar;
            }
        }
        // Print results
        System.out.println("Character: " + longestChar);
        System.out.println("Length of longest consecutive sequence: " + longestLength);

        input.close();
    }
}
