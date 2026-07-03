import java.util.Scanner;
public class SimpleATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Simple ATM System: ");
        System.out.println("Enter your Balance: ");
        int balance=input.nextInt();
        while (true) {
            System.out.println("Show  ATM System  Menu:");
            System.out.println("1. Check Balance: ");
            System.out.println("2. Deposit money: ");
            System.out.println("3. Withdraw money: ");
            System.out.println("4. Exit : ");
            System.out.println("Enter your choice ( 1 To 4) . ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your Current balance: " + balance);
                    break;
                case 2:
                    System.out.println("Enter deposit amount.,");
                    int depositAmount = input.nextInt();
                    balance += depositAmount;
                    System.out.println("Deposit amount  Successful!.");
                    System.out.println("Updated the balance: " + balance);
                    break;
                case 3:
                    System.out.println("Enter withdraw amount. ");
                    int withdraweAmount = input.nextInt();
                    if (balance >= withdraweAmount) {
                        balance -= withdraweAmount;
                        System.out.println("Withdraw amount successful. ");
                        System.out.println("Updated the balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance. ");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. ");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. ");
            }
        }
    }
}
