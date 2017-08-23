package info.mikasez.kata.bank.account;

import info.mikasez.kata.bank.account.history.ExecutedTransaction;

import java.util.ArrayList;

/**
 * Representing all transaction that happened in an account <br/>
 * Transactions can be only added, none can be deleted
 * */
public class Transactions extends ArrayList<ExecutedTransaction>{

    public String[][] allToPrintableArray() {
        return this.stream()
                .map(ExecutedTransaction::toPrintableArray)
                .toArray(String[][]::new);
    }
}
