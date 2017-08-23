package info.mikasez.kata.bank.account.history;

import info.mikasez.kata.bank.account.Amount;
import info.mikasez.kata.bank.account.actions.Transaction;

/**
 * Class representing an already executed transaction <br/>
 * Contains supplementary information on the account <br/>
 * When the transaction was executed
 */
public class ExecutedTransaction {

    private Transaction transaction;
    private Amount balance;


    /**
     * Create a new executed transaction for history purposes <br/>
     *
     * @param currentBalance the account balance after the transaction was executed
     * @param transaction    the transaction applied to the account
     */
    public static ExecutedTransaction from(Transaction transaction, Amount currentBalance) {
        return new ExecutedTransaction(transaction, currentBalance);
    }

    private ExecutedTransaction(Transaction transaction, Amount balance) {
        this.transaction = transaction;
        this.balance = balance;
    }

    /**
     * Returns a string representation of the content of an executed transaction
     */
    public String[] toPrintableArray() {
        final String[] transactionArray = transaction.asStringArray();
        String [] result = new String[transactionArray.length + 1];
        System.arraycopy(transactionArray, 0, result, 0, transactionArray.length);
        result[transactionArray.length] = balance.toString();
        return result;
    }

    @Override
    public String toString() {
        return "ExecutedTransaction{" +
                "transaction=" + transaction +
                ", balance=" + balance +
                '}';
    }
}
