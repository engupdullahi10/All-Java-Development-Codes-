import java.util.Scanner;

public class Task20 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter amount in USD: ");
        double usd= input.nextDouble();
        double PKR=27850;
        double EUR= 92 ;
        double  GBP=80;

        System.out.println("Simple Output: ");
        System.out.println("USD Amount: "+ usd);
        System.out.println("In PKR  : " +  PKR);
        System.out.println("In EUR  : " +  EUR);
        System.out.println("In GBP  : " +  GBP);
        input.close();
    }
}
