package learning.java;

public class Account {
	 // Data member
    private double balance;

    // No-argument constructor
    public Account() {
        balance = 0.0;
    }

    // Two-argument constructor
    public Account(double initialBalance) {
        // Validate if initialBalance is non-negative before setting it
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            System.out.println("Error: Initial balance must be non-negative. Setting balance to 0.0.");
            balance = 0.0;
        }
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // Method to withdraw from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Error: Invalid withdrawal amount or insufficient funds.");
        }
    }

    public static void main(String[] args) {
        // Example usage
        Account account1 = new Account(); // Using no-argument constructor
        System.out.println("Account 1 - Balance: " + account1.getBalance());
        account1.deposit(100.0);
        account1.withdraw(30.0);
        System.out.println("Account 1 - Updated Balance: " + account1.getBalance());

        Account account2 = new Account(500.0); // Using two-argument constructor
        System.out.println("\nAccount 2 - Balance: " + account2.getBalance());
        account2.deposit(200.0);
        account2.withdraw(50.0);
        System.out.println("Account 2 - Updated Balance: " + account2.getBalance());
    }

}
