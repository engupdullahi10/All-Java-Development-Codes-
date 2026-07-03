import java.util.Scanner;
public class  Task2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of unit consumed: ");
        int units = input.nextInt();
        double bill_amount = 0;
        if (units <= 50) {
            bill_amount = units * 0.50;
        } else if (units <= 150) {
            bill_amount = 50 * 0.50;
            bill_amount += (units - 50) * 0.75;
        } else {
            bill_amount = 50 * 0.50;
            bill_amount+= 100 * 0.75;
            bill_amount+= (units - 150) * 1.00;
        }
        System.out.println("Simple Output: ");
        System.out.println("Number Of Units: " + units);
        System.out.println("Total Water Bill: "+ bill_amount + "$");
        input.close();
    }
}
