import java.util.Scanner;
public class Task3 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter recharge amount: ");
        double recharge=input.nextDouble();
        double bonus= 0;
        if (recharge<=100){
            System.out.println("No bonus: ");
        } else if (recharge>100 && recharge <=200) {
            System.out.println("5% bonus");

        }else {
            System.out.println("10% bonus");
        }
        System.out.println("Total Amount: " + bonus);
        input.close();
    }
}
