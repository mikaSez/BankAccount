package info.mikasez.kata.bank.account.actions;

import info.mikasez.kata.bank.account.Amount;

public interface Transaction {

    Amount act(Amount balance);
}
