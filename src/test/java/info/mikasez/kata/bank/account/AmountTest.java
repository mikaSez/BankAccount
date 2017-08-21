package info.mikasez.kata.bank.account;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class AmountTest {
    @Test
    public void shouldAddTwoAmounts() throws Exception {
        //ARRANGE
        Amount one = new Amount(100L);
        Amount two = new Amount(100L);
        //ACT
        Amount three = one.plus(two);
        //ASSERT
        assertThat(one.getAmount()).isEqualTo(100L);
        assertThat(two.getAmount()).isEqualTo(100L);
        assertThat(three.getAmount()).isEqualTo(200L);

    }


    @Test
    public void shouldSubtractTwoAmounts() throws Exception {
        //ARRANGE
        Amount one = new Amount(100L);
        Amount two = new Amount(100L);
        //ACT
        Amount three = one.minus(two);
        //ASSERT
        assertThat(one.getAmount()).isEqualTo(100L);
        assertThat(two.getAmount()).isEqualTo(100L);
        assertThat(three.getAmount()).isEqualTo(0L);

    }

}