package functional;

import info.mikasez.kata.bank.account.Account;
import info.mikasez.kata.bank.account.Amount;
import info.mikasez.kata.bank.account.Transactions;
import info.mikasez.kata.bank.account.actions.Deposit;
import info.mikasez.kata.bank.account.actions.Transaction;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class AcceptanceTests {


    @Test
    public void shouldBeAbleToMakeADeposit(){
        //ACT
        Account myAccount = new Account("Name", 1000L);
        Transaction deposit = new Deposit(350L, LocalDateTime.parse("2007-12-03T10:15:30"));
        //ARRANGE
        myAccount.accept(deposit);
        //ASSERT
        assertThat(myAccount.balance()).isEqualTo(new Amount(1350L));
        assertThat(myAccount.transactionProcessed(deposit)).isTrue();
    }

    @Test
    public void shouldBeAbleToMakeAWithdraw(){
        //ACT

        //ARRANGE

        //ASSERT
        fail("not yet implemented");
    }

    @Test
    public void shouldBeAbleToSeeTheHistory(){
        //ACT

        //ARRANGE

        //ASSERT
        fail("not yet implemented");
    }
}
