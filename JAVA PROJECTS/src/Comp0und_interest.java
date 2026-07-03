import java.util.Scanner;
public class Comp0und_interest {
    public  static void main(String[] args){
        //Compound interest Calculation:
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        double principle=input.nextDouble();
        System.out.println("Enter the rate of (n %): ");
        double rate=input.nextDouble() / 100;
        System.out.println("Enter the number the time compound: ");
        int timeCompound=input.nextInt();
        System.out.println("Enter the number of the years: ");
        int year=input.nextInt();
        double amount= principle * Math.pow(1 + rate / timeCompound , timeCompound * year);
        double interest= amount - principle ;
        System.out.println("Simple Output Of The Compound Interest: ");
        System.out.println("Principle: " + principle);
        System.out.println("Rate: " + rate);
        System.out.println("Time Compound: " + timeCompound);
        System.out.println("Time Period: " + year + "  years");
        System.out.println("Interest Earned: $ " + interest);
        System.out.println("Total Amount: " + amount);
        input.close();

    }
}
