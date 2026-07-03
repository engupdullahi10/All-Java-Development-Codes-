import java.util.Scanner;
public class Task10 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        double principle= input.nextDouble();
        System.out.println("Enter the interest rate (in %): ");
        double rate= input.nextDouble();
        System.out.println("Enter the number of years: ");
        int years=input.nextInt();
        System.out.println("Principle: " + principle);
        System.out.println("Rate: " + rate);
        System.out.println("Years: " + years);
        System.out.println("Simple Output Of The Years: ");
        for (int i = 1 ; i<=years ; i++){
            double amount= principle * Math.pow((1 + rate / 100) , i);
            System.out.printf("%d\t%.2f%n" , i , amount);
        }
       // System.out.println("Simple Output Of The Years: ");
        input.close();
    }
}
