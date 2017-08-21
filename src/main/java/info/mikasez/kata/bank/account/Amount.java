package info.mikasez.kata.bank.account;

import java.util.Objects;

/**
 * Class representing the transaction currency <br/>
 * Should not be mutable
 * */
public class Amount {
    private long amount;

    public Amount(long amount) {
        this.amount = amount;
    }

    /**
     * Create a new amount from a value
     * @param value positive value representing currency
     * */
    public static Amount from(long value) {
        assert value > 0L;
        return new Amount(value);
    }

    /**
     * Returns current amount value
     * @return amount : numeric representation of this money
     * */
    public long getAmount() {
        return amount;
    }

    /**
     * Returns a new amount value constructed adding together two other amounts <br/>
     * Doesn't change any of other amounts
     * @param amount : amount to add
     * @return sum of this amount value with passed value
     * */
    public Amount plus(Amount amount) {
        return new Amount(this.amount + amount.amount);
    }

    /**
     * Returns a new amount value constructed subtraction passed amount to the current amount<br/>
     * Doesn't change any of other amounts
     * @param amount : amount to subtract
     * @return subtraction of this amount value with passed value
     * */
    public Amount minus(Amount amount) {
        return new Amount(this.amount - amount.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amount amount1 = (Amount) o;
        return amount == amount1.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return "[" + amount + ']';
    }
}
