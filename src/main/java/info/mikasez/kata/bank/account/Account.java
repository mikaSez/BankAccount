package info.mikasez.kata.bank.account;

import info.mikasez.kata.bank.account.actions.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private final AccountName name;
    private Amount balance;
    private Transactions transactions;

    public Account(String accountName, long initialDeposit) {
        this.transactions = new Transactions();
        this.name = new AccountName(accountName);
        this.balance = new Amount(initialDeposit);
    }

    public void accept(Transaction deposit) {
        this.transactions.add(deposit);
        this.balance = deposit.act(this.balance);
    }

    public Amount balance() {
        return balance;
    }

    public Transactions getTransactions() {
        return transactions;
    }
}
