package info.mikasez.kata.bank.account.actions;

import info.mikasez.kata.bank.account.Amount;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;


public class DepositTest {

    @Test
    public void shouldMakeADeposit(){
        //ARRANGE
        Deposit deposit = new Deposit(200L, LocalDateTime.now());
        Amount amountToActUpon = Amount.from((100L));
        Amount expected = Amount.from(300L);
        //ACT
        Amount result = deposit.actUpon(amountToActUpon);
        //ASSERT
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldMakeAnArrayRepresentation(){
        //ARRANGE
        Deposit deposit = new Deposit(200L, LocalDateTime.parse("2007-12-03T10:15:30"));
        String[] expected = new String[]{"DEPOSIT", "2007-12-03T10:15:30", "200"};
        //ACT
        String []result = deposit.asStringArray();
        //ASSERT
        Assertions.assertThat(result).isEqualTo(expected);
    }
}