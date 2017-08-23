package info.mikasez.kata.bank.account.actions;

import info.mikasez.kata.bank.account.Amount;

public interface Transaction {

    /**
     * Perform an action on the amount according to the rules of the given transaction <br/>
     *
     * @param balance the amount we want to act upon in our transaction (the amount stays immutable)
     * @return The new amount
     */
    Amount actUpon(final Amount balance);

    /**
     * Returns a string representation of the content of a given transaction
     */
    String[] asStringArray();
}
