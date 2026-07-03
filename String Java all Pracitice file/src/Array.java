import java.util.Scanner;
//1D ARRAY
public class Array {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=input.nextInt();
        int[] number=new  int[n];
        System.out.println("Enter your " + n + " ");
        for (int i=0; i<number.length; i++){
            number[i]=input.nextInt();
        }
        System.out.println("\nYour entered ");
        for (int i=0; i<number.length; i++){
            System.out.println("Index " + i + " " + number[i]);
        }
        int sum=0;
        for (int num: number){
            sum+=num;
        }
        System.out.println("Sum of array: " + sum);
    }
}