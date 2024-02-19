package lessons.lesson7.assignments.bankAccountInterface;

public interface BankAccount {

    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    void transfer();
    String[] getTransactionHistory();

}
