package info.mikasez.kata.bank.account;

import info.mikasez.kata.bank.account.actions.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Representing all transaction that happened in an account <br/>
 * Transactions can be only added, none can be deleted
 * */
public class Transactions {
    private List<Transaction> transactionList;

    public Transactions() {
        this.transactionList = new ArrayList<>();
    }

    /**
     * Adds a new transaction to the list (not copied)
     * @param transaction : transaction to be added
     * @return the added transaction
     * */
    public Transaction add(final Transaction transaction){
        this.transactionList.add(transaction);
        return transaction;
    }

    /**
     * Verify if a given transaction already played on this account
     * @param transaction element to be searched for
     * */
    public boolean contains(final Transaction transaction){
        return this.transactionList.contains(transaction);
    }
}
