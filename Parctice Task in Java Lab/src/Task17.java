import java.util.Scanner;

public class Task17 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter recharge amount: ");
        double recharge=input.nextDouble();
        double bonus= 0.0;
        double totalbalance= recharge + bonus ;
        if (recharge<=100){
            bonus= 0.0;
        } else if (recharge>100 && recharge <=200) {
             bonus= 0.05;

        }else {
             bonus= 0.01;
        }
        System.out.println("Simple Output: ");
        System.out.println("Recharge Amount: " + recharge);
        System.out.println("Bonus Added: " + bonus);
        System.out.println("Total Balance: " + totalbalance);
        input.close();
    }
}
