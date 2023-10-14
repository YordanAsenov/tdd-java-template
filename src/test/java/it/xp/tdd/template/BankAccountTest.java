package it.xp.tdd.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountTest {
    @DisplayName("Initial balance 250€ + 50€ deposit")
    @Test
    void testBankAccount_WhenUserDeposit50Euros_ShouldHave300Euros() {
        // given a bank account with a balance of 250 €
        BankAccount bankAccount = BankAccount.builder()
            .balance(250d)
            .build();

        // when the user deposit 50 €
        TransactionResult result = bankAccount.deposit(50d);

        // then the final balance should be 300 €
        Assertions.assertEquals(300d, result.getBalance(), "Final balance should be 300€");
    }

    @DisplayName("Initial balance 250€ + 50€ deposit + 50€ deposit")
    @Test
    void testBankAccount_WhenUserDeposit50EurosTwice_ShouldHave350Euros() {
        // given a bank account with a balance of 250 €
        BankAccount bankAccount = BankAccount.builder()
            .balance(250d)
            .build();
        bankAccount.deposit(50d);

        // when the user deposit 50 € twice
        TransactionResult result = bankAccount.deposit(50d);

        // then the final balance should be 300 €
        Assertions.assertEquals(350d, result.getBalance(), "Final balance should be 350€");
    }

    @DisplayName("Initial balance 300€ - 100€ withdrawal")
    @Test
    void testBankAccount_WhenUserWithdraws50Euros_ShouldHave250Euros() {
        // given a bank account with a balance of 300 €
        BankAccount bankAccount = BankAccount.builder()
            .balance(300d)
            .build();

        // when the user withdraws 100 €
        TransactionResult result = bankAccount.withdraw(100d);

        // then the final balance should be 200 €
        Assertions.assertEquals(200d, result.getBalance(), "Final balance should be 200€");
    }

    @DisplayName("Negative balance is not permitted")
    @Test
    void testBankAccount_WhenUserWithdraws50Euros_ShouldNotReceiveNoMoneyAndBeWarned() {
        // given a bank account with a balance of 100 €
        BankAccount bankAccount = BankAccount.builder()
            .balance(100d)
            .build();

        // when the user withdrawal 150 €
        TransactionResult result = bankAccount.withdraw(150d);

        // then the withdrawal should not be possible
        Assertions.assertEquals(Status.KO, result.getStatus(), "Withdraw is not permitted");
        Assertions.assertEquals(100d, result.getBalance(), "Final balance should be 100€");
    }
}
