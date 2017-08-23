package info.mikasez.kata.bank.account.actions;

import info.mikasez.kata.bank.account.Amount;

import java.time.LocalDateTime;
import java.util.Objects;

import static java.time.format.DateTimeFormatter.ISO_DATE_TIME;


/**
 * Represents a negative transaction on an account <br/>
 * It's an immutable object
 * */
public class Withdraw implements Transaction {

    private static final TransactionType TYPE = TransactionType.WITHDRAW;
    private final Amount amount;
    private final LocalDateTime transactionTime;


    /**
     * @param amount          money to be withdrawn from the account
     * @param transactionTime the date / time of the transaction
     */
    public Withdraw(long amount, LocalDateTime transactionTime) {
        this.amount = Amount.from(amount);
        this.transactionTime = transactionTime;
    }

    @Override
    public Amount actUpon(Amount balance) {
        return balance.minus(amount);
    }

    @Override
    public String[] asStringArray() {
        return new String[]{TYPE.name(), transactionTime.format(ISO_DATE_TIME), amount.toString()};
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Withdraw deposit = (Withdraw) o;
        return Objects.equals(amount, deposit.amount) &&
                Objects.equals(transactionTime, deposit.transactionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, transactionTime);
    }
}
