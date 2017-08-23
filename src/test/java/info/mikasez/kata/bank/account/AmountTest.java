package info.mikasez.kata.bank.account;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class AmountTest {
    @Test
    public void shouldAddTwoAmounts() throws Exception {
        //ARRANGE
        Amount one = Amount.from(100L);
        Amount two = Amount.from(100L);

        Amount expectedUnchanged = Amount.from(100L);
        Amount expectedResult = Amount.from(200L);
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
        Amount one = Amount.from(100L);
        Amount two = Amount.from(100L);


        Amount expectedUnchanged = Amount.from(100L);
        Amount expectedResult = Amount.from(0L);
        //ACT
        Amount three = one.minus(two);
        //ASSERT
        assertThat(one).isEqualTo(expectedUnchanged);
        assertThat(two).isEqualTo(expectedUnchanged);
        assertThat(three).isEqualTo(expectedResult);

    }

}