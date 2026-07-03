import java.util.Scanner;

public class Substring {
    //Substring it is  simply a part of the string.
    static boolean isPlaindrome(String a , int i , int j){
        while (i<j){
            if (a.charAt(i) !=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return  true ;
    }
    static int countPs(String a){
        int n=a.length();
        int  reversed= 0;
        for (int i=1 ; i< n;i++){
            for (int j= i + 1 ; j<n ; j++){
                if (isPlaindrome(a , i , j)){
                    reversed ++;
                }
            }

        }
        return reversed ;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word: ");
        String a=input.nextLine();
        System.out.println(countPs(a));
        input.close();
    }
}
