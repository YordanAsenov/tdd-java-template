package it.xp.tdd.template;

import lombok.Builder;

@Builder
public class BankAccount {
    private Double balance;

    public TransactionResult deposit(double amount) {
        balance += amount;
        return new TransactionResult(balance, Status.OK);
    }

    public TransactionResult withdraw(double amount) {
        if (balance - amount < 0) {
            return new TransactionResult(balance, Status.KO);
        }

        balance -= amount;
        return new TransactionResult(balance, Status.OK);
    }
}
