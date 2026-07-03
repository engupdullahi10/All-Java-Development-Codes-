import java.util.Scanner;
//Task 3: Find Even or Odd
public class EvenOddF {
    public static void ChechEvenOdd(int number){
        if(number%2==0){
            System.out.println("The number is Even:  " + number );
        }else {
            System.out.println("The number is Odd: " + number);
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number. ");
        int number=input.nextInt();
        ChechEvenOdd(number);
        input.close();

    }
}
