package info.mikasez.kata.bank.account;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class AmountTest {
    @Test
    public void shouldAddTwoAmounts() throws Exception {
        //ARRANGE
        Amount one = new Amount(100L);
        Amount two = new Amount(100L);

        Amount expectedUnchanged = new Amount(100L);
        Amount expectedResult = new Amount(200L);
        //ACT
        Amount three = one.plus(two);
        //ASSERT
        assertThat(one).isEqualTo(expectedUnchanged);
        assertThat(two).isEqualTo(expectedUnchanged);
        assertThat(three).isEqualTo(expectedResult);

    }


    @Test
    public void shouldSubtractTwoAmounts() throws Exception {
        //ARRANGE
        Amount one = new Amount(100L);
        Amount two = new Amount(100L);


        Amount expectedUnchanged = new Amount(100L);
        Amount expectedResult = new Amount(0L);
        //ACT
        Amount three = one.minus(two);
        //ASSERT
        assertThat(one).isEqualTo(expectedUnchanged);
        assertThat(two).isEqualTo(expectedUnchanged);
        assertThat(three).isEqualTo(expectedResult);

    }

}