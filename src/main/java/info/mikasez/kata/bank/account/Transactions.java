package info.mikasez.kata.bank.account;

import info.mikasez.kata.bank.account.history.ExecutedTransaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Representing all transaction that happened in an account <br/>
 * Transactions can be only added, none can be deleted
 * */
public class Transactions {
    private List<ExecutedTransaction> transactionList;

    public Transactions() {
        this.transactionList = new ArrayList<>();
    }

    /**
     * Adds a new transaction to the list (not copied)
     * @param transaction : transaction to be added
     * @return the added transaction
     * */
    public ExecutedTransaction add(final ExecutedTransaction transaction){
        this.transactionList.add(transaction);
        return transaction;
    }

    public String[][] all() {
        return transactionList.stream()
                .map(ExecutedTransaction::toPrintableArray)
                .toArray(String[][]::new);
    }
}
