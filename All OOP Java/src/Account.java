public class Account {

    private double checkingBalance = 0;
    private double savingBalance = 0;

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void depositChecking(double amount) {
        if (amount > 0)
            checkingBalance += amount;
    }

    public void withdrawChecking(double amount) {
        if (amount > 0 && checkingBalance >= amount)
            checkingBalance -= amount;
    }

    public void depositSaving(double amount) {
        if (amount > 0)
            savingBalance += amount;
    }

    public void withdrawSaving(double amount) {
        if (amount > 0 && savingBalance >= amount)
            savingBalance -= amount;
    }
}