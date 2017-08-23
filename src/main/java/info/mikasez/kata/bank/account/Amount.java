package info.mikasez.kata.bank.account;

import java.util.Objects;

/**
 * Class representing the transaction currency <br/>
 * Should not be mutable
 * */
public class Amount {
    private final long value;

    private Amount(long value) {
        this.value = value;
    }

    /**
     * Create a new amount from a value
     * @param value positive value representing currency
     * */
    public static Amount from(long value) {
        return new Amount(value);
    }

    /**
     * Returns a new amount value constructed adding together two other amounts <br/>
     * Doesn't change any of other amounts
     * @param amount : amount to add
     * @return sum of this amount value with passed value
     * */
    public Amount plus(Amount amount) {
        return new Amount(this.value + amount.value);
    }

    /**
     * Returns a new amount value constructed subtraction passed amount to the current amount<br/>
     * Doesn't change any of other amounts
     * @param amount : amount to subtract
     * @return subtraction of this amount value with passed value
     * */
    public Amount minus(Amount amount) {
        return new Amount(this.value - amount.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amount amount1 = (Amount) o;
        return value == amount1.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value + "";
    }

}
