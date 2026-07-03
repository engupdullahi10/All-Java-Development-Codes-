import java.util.Scanner;
public class ATMBankingSystem {
    public static int deposit(int balance , Scanner input){
        System.out.print("Enter your deposit Amount: ");
        int deposit=input.nextInt();
        balance+=deposit;
        System.out.print("Deposit amount  Successful!.");
        System.out.print("Updated the balance: " + balance);
        return balance;
    }
    public static int  withdraw(int balance , Scanner input){
        System.out.println("Enter your withdraw amount: ");
        int withdraw=input.nextInt();
        if (balance>=withdraw){
            balance-=withdraw;
            System.out.println("Withdraw amount Successful!.");
            System.out.println("Updated the balance: " + balance);

        }else {
            System.out.println("Insufficient balance. ");
        }
        return balance;
    }
    //ATM Banking System
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your card name: ");
        String name=input.nextLine();
        int correctPin= 13137990;
       int attempts=0;
       while (attempts <3){
           System.out.println("Enter you card pin: ");
           int pin=input.nextInt();
           if (pin==correctPin){
               System.out.println("Access Granted! ");
               break;
           }else {
               System.out.println("Wrong Pin!.");
               attempts++;
           }
           if (attempts==3){
               System.out.println("Your account is locked. Too many attempts: ");
           }
       }
        System.out.println("Enter you  Balance: ");
        int balance=input.nextInt();
        while (true){
            System.out.println("1. Check Balance: ");
            System.out.println("2. Deposit Amount: ");
            System.out.println("3. Withdraw Amount: ");
            System.out.println("4. Exit ");
            System.out.println("Enter your choice: ");
            int choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Your Current Balance: " + balance);
                    break;
                case 2:
                    balance=deposit(balance , input);
                    break;
                case 3:
                    balance=withdraw(balance , input);
                    break;
                case 4:
                    System.out.println("Exit the ATM Bank System. ");
                    return;
                default:
                    System.out.println("Invalid Choice ATM System. ");


            }
        }
    }
}
