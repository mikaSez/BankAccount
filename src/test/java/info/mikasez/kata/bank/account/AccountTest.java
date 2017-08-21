package info.mikasez.kata.bank.account;

import info.mikasez.kata.bank.account.actions.Deposit;
import info.mikasez.kata.bank.account.actions.Transaction;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;


public class AccountTest {

    @Test
    public void shouldAcceptDeposits(){
        //ARRANGE
        Account account = new Account("name", 100L);
        Transaction deposit = new Deposit(100L, LocalDateTime.parse("2017-12-03T10:15:30"));
        //ACT
        account.accept(deposit);
        //ASSERT
        Assertions.assertThat(account.transactionProcessed(deposit)).isTrue();
        Assertions.assertThat(account.balance()).isEqualTo(Amount.from(200L));
    }
}