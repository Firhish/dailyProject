package lessons.lesson7.assignments.bankAccountInterface;

public class Main {
    public static void main(String[] args) {
        // Creating instances of SavingsAccount and CheckingAccount
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 0.02);
        CheckingAccount checkingAccount = new CheckingAccount(500.0, 200.0);

        // Performing transactions and displaying balances
        savingsAccount.deposit(200.0);
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());

        checkingAccount.withdraw(300.0);
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());
    }
    
}
