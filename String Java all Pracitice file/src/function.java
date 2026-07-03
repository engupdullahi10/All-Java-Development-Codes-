import java.util.Scanner;
public class function {
    //Check For Palindrome Word
    static boolean isPalindrome(String word){
      int lift= 0;
      int right= word.length()-1;
      while (lift<right){
          if (word.charAt(lift) != word.charAt(right)){
              return false ;
          }
          lift++;
          right--;
      }
      return  true ;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence=input.nextLine();
        String [] words=sentence.split(" ");
        int count= 0;
        for (String word: words){
            if (isPalindrome(word))
               count++;
        }
        System.out.println("The number of the palindrome is: " + count);
    }

}
