package lessons.lesson7.assignments.bankAccountInterface;

import java.time.LocalDate;

public class Transaction {

    private int id;
    private double amount;
    private LocalDate timestamp;

    public Transaction(int id, double amount, LocalDate timestamp){
        this.id = id;
        this.amount = amount;
        this.timestamp = timestamp;
    }
    
}
