package info.mikasez.kata.bank.account;

import java.util.Objects;

public class Amount {
    private long amount;

    public Amount(long amount) {
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }

    public static Amount from(long value) {
        return new Amount(value);
    }

    public Amount plus(Amount amount) {
        return new Amount(this.amount + amount.amount);
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
}
