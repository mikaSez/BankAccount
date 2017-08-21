package info.mikasez.kata.bank.account.actions;

import info.mikasez.kata.bank.account.Amount;

import java.time.LocalDateTime;
import java.util.Objects;

public class Deposit implements Transaction{
    private final Amount amount;
    private final LocalDateTime transactionTime;

    public Deposit(long amount, LocalDateTime transactionTime) {
        this.amount = new Amount(amount);
        this.transactionTime = transactionTime;
    }

    @Override
    public Amount act(Amount balance) {
        return balance.plus(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit deposit = (Deposit) o;
        return Objects.equals(amount, deposit.amount) &&
                Objects.equals(transactionTime, deposit.transactionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, transactionTime);
    }
}
