package info.mikasez.kata.bank.account;

import info.mikasez.kata.bank.account.actions.Transaction;
import info.mikasez.kata.bank.account.history.ExecutedTransaction;

/**
 * Class representing a simple bank account <br/>
 * You can deposit money into this account
 * */
public class Account {

    private Amount balance;
    private Transactions transactions;


    public Account( long initialDeposit) {
        this.transactions = new Transactions();
        this.balance = new Amount(initialDeposit);
    }

    /**
     * Execute a transaction on a given account <br/>
     * The transaction itself determines the action on the account balance <br/>
     * All transaction are recorded
     * @param transaction {@link Transaction} to be executed on this account
     * */
    public void accept(Transaction transaction) {
        this.balance = transaction.act(this.balance);
        this.transactions.add(ExecutedTransaction.from(transaction, this.balance));
    }

    /**
     * Returns the current balance of the account
     * */
    public Amount balance() {
        return balance;
    }


   public String[][] extractHistory() {
        return transactions.all();
    }
}
