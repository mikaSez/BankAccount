package info.mikasez.kata.bank.account;

import info.mikasez.kata.bank.account.actions.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Transactions {
    private List<Transaction> transactionList;

    public Transactions() {
        this.transactionList = new ArrayList<>();
    }

    public Transaction add(final Transaction transaction){
        this.transactionList.add(transaction);
        return transaction;
    }

    public boolean contains(final Transaction transaction){
        return this.transactionList.contains(transaction);
    }
}
