// Class Bank
class BankAccount{
    private String accountNumber;
    private String accountName;
    private String accountType;
    private double balance;
    private static int totalAmount;
    // Default Construction
    public BankAccount(){
        this.accountNumber="Unknown";
        this.accountName="Unknown";
        this.accountType="Unknown";
        this.balance= 0.0;
        totalAmount++;
    }
    // Method Construction
    public BankAccount(String accountNumber , String accountName , String accountType , double balance){
        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.accountType=accountType;
        this.balance=balance;
        totalAmount++;
    }
    // Getter & Setter

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // Method Deposit
    public void deposit(double amount){
        if (amount>=0){
            balance+=amount;
            System.out.println(amount + " deposit successfully.");
        }else {
            System.out.println("Invalid deposit amount.");
        }
    }
    // Method withdraw
    public void withdraw(double amount){
        if (amount<=0){
            System.out.println("Invalid withdraw amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        }else {
            balance -=amount;
            System.out.println(amount + " withdraw successfully amount");
        }
    }
    // Check Balance
    public void checkBalance(){
        System.out.println("Current balance is : " + balance);
    }
    // Display Inform
    public void displayInform(){
        System.out.println("\n====Display Account Details====");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Types: " + accountType);
        System.out.println("Account Balance: " + balance);
    }
    // Show total amount
    public static void showTotalAmount(){
        System.out.println("\nTotal Amount: " + totalAmount);
    }
}
public class Task16 {
    //Task2: Bank Account Management System
    public static void main(String[] args){
        // Create 2 Bank Account Object
        BankAccount bankAccount1=new BankAccount("L101F" , "Eng Abdullahi" , "IBBC Bank" , 5000);
        BankAccount bankAccount2=new BankAccount("L102F" , "Hafsa" , "Waafi Bank" , 2500);
        // Display Inform
        bankAccount1.displayInform();
        bankAccount2.displayInform();
        //Call all Methods
        bankAccount1.deposit(5000);
        bankAccount1.withdraw(2500);
        // Check Balance
        bankAccount1.checkBalance();
        // Total Amount
        BankAccount.showTotalAmount();

    }
}
