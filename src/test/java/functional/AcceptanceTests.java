package functional;

import dnl.utils.text.table.TextTable;
import info.mikasez.kata.bank.account.Account;
import info.mikasez.kata.bank.account.Amount;
import info.mikasez.kata.bank.account.actions.Deposit;
import info.mikasez.kata.bank.account.actions.Transaction;
import info.mikasez.kata.bank.account.actions.Withdraw;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class AcceptanceTests {


    @Test
    public void shouldBeAbleToMakeADeposit(){
        //ACT
        Account myAccount = new Account( 1000L);
        Transaction deposit = new Deposit(350L, LocalDateTime.parse("2007-12-03T10:15:30"));
        //ARRANGE
        myAccount.accept(deposit);
        //ASSERT
        assertThat(myAccount.balance()).isEqualTo(Amount.from(1350L));
    }

    @Test
    public void shouldBeAbleToMakeAWithdraw(){
        //ACT
        Account myAccount = new Account( 1000L);
        Transaction withdraw = new Withdraw(350L, LocalDateTime.parse("2007-12-03T10:15:30"));
        //ARRANGE
        myAccount.accept(withdraw);
        //ASSERT
        assertThat(myAccount.balance()).isEqualTo(Amount.from(650L));
    }

    @Test
    public void shouldBeAbleToSeeTheHistory() {
        //ACT
        Account myAccount = new Account( 1000L);
        Transaction deposit = new Deposit(350L, LocalDateTime.parse("2007-12-03T10:15:30"));
        Transaction withdraw = new Withdraw(200L, LocalDateTime.parse("2007-12-04T10:15:30"));
        Transaction withdraw2 = new Withdraw(100L, LocalDateTime.parse("2007-12-10T10:15:30"));
        //ARRANGE
        myAccount.accept(deposit);
        myAccount.accept(withdraw);
        myAccount.accept(withdraw2);
        //ASSERT
        String [][] data = new String[3][4];
        String [] columns = {"operation", "date", "amount", "balance"};
        String [] datum = {"DEPOSIT", "2007-12-03T10:15:30", "350", "1350"};
        String [] datum2 = {"WITHDRAW", "2007-12-04T10:15:30", "200", "1150"};
        String [] datum3 = {"WITHDRAW", "2007-12-10T10:15:30", "100", "1050"};
        data[0] = datum;
        data[1] = datum2;
        data[2] = datum3;

        assertThat(myAccount.balance()).isEqualTo(Amount.from(1050L));
        assertThat(myAccount.extractHistory()).isEqualTo(data);

        //just for visuals
        TextTable tt = new TextTable(columns, data);
        tt.printTable();
    }
}
