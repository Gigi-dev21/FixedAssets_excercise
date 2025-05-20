public class BankAccount implements Valuable {
    private String accountName;
    private double balance;

    public BankAccount(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getValue() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }
}
