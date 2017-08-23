package info.mikasez.kata.bank.account;

import info.mikasez.kata.bank.account.actions.ExecutedTransaction;
import info.mikasez.kata.bank.account.actions.Transaction;

/**
 * Class representing a simple bank account <br/>
 * You can deposit money into this account
 * */
public class Account {

    private final AccountName name;
    private Amount balance;
    private Transactions transactions;


    public Account(String accountName, long initialDeposit) {
        this.transactions = new Transactions();
        this.name = new AccountName(accountName);
        this.balance = new Amount(initialDeposit);
    }

    /**
     * Execute a transaction on a given account <br/>
     * The transaction itself determines the action on the account balance <br/>
     * All transaction are recorded
     * @param transaction {@link Transaction} to be executed on this account
     * */
    public void accept(Transaction transaction) {
        this.transactions.add(transaction);
        this.balance = transaction.act(this.balance);
        ExecutedTransaction executedTransaction = ExecutedTransaction.from(transaction, transaction.)
    }

    /**
     * Returns the current balance of the account
     * */
    public Amount balance() {
        return balance;
    }


    /**
     * Checks if a transaction already played on a given account <br/>
     * @param transaction: a transaction to be checked <br/>
     * @return true if transaction played
     * */
    public boolean transactionProcessed(Transaction transaction){
        return transactions.contains(transaction);
    }

    public String[] extractHistory() {
        return transactions.all();
    }
}
