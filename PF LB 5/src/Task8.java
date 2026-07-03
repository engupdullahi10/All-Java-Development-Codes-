
import java.util.Scanner;
public class Task8{
    static double calculateBonus(double salary, int years) {
        if (years >= 10) {
            return salary * 0.20;
        }
        else if (years >= 5){
            return salary * 0.10;
        }
        else {
            return salary * 0.05;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter salary of employee " + i + ": ");
            double salary = input.nextDouble();
            System.out.print("Enter years of service: ");
            int years = input.nextInt();
            System.out.println("Simple Output. ");
            System.out.println("Salary Of Employee. " + salary );
            System.out.println("Years Of Service: " + years);
            System.out.println("Employee " + i + " → Bonus: " + calculateBonus(salary, years));
        }
        input.close();
    }
}
