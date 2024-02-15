package lessons.lesson7.assignments.bankAccountInterface;

class SavingsAccount implements BankAccount {
    private double balance;
    private double interestRate;

    // Constructor
    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    // Implementing deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Implementing withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Implementing getBalance method
    @Override
    public double getBalance() {
        return balance + (balance * interestRate); // Adding interest to the balance
    }
}
