//Water Bill Calculation System
import java.util.Scanner;
public class Task16 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("WELCOME TO WATER BILL. ");
        System.out.println("Enter the customers name OR customers ID. ");
        String customersName=input.nextLine();
        System.out.println("Enter number of units consumed: ");
        int unit=input.nextInt();
        double  bill= 0.0;
        if (unit<=50){
            bill= unit * 0.50;
        } else if (unit>=50 && unit <=100) {
            bill= unit * 0.75;

        }else {
            bill= unit * 1.00;
        }
        System.out.println("WATER BILL SUMMERY: ");
        System.out.println("Customers: " + customersName);
        System.out.println("Unit: " + unit);
        System.out.println("Total Water Bill: " + bill);
        input.close();
    }
}
