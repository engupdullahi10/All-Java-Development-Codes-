import java.util.Scanner;
public class sumOfNumbers {
    public static int sumOfNumber(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        return sum;
    }
    public static int sumOfEvenNumber(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return sum;
    }
    public static int sumOfOddNumber(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int sumNumber = sumOfNumber(number);
        System.out.println("Sum of numbers = " + sumNumber);
        System.out.println("Even Number: ");
        int evenNumber = sumOfEvenNumber(number);
        System.out.println("Sum of even numbers = " + evenNumber);
        System.out.println("Odd Number: ");
        int oddNumber = sumOfOddNumber(number);
        System.out.println("Sum of odd numbers = " + oddNumber);
    }
}
