package info.mikasez.kata.bank.account.actions;

import info.mikasez.kata.bank.account.Amount;

import java.time.LocalDateTime;

/**
 * Class representing an already executed transaction <br/>
 * Contains supplementary information on the account <br/>
 * When the transaction was executed
 */
public class ExecutedTransaction {
    enum TransactionType {DEPOSIT, WITHDRAW}

    ;

    private TransactionType type;
    private Transaction transaction;
    private Amount balance;


    /**
     * Create a new executed transaction for history purposes <br/>
     *
     * @param currentBalance the account balance after the transaction was executed
     * @param transaction    the transaction applied to the account
     * @param type           the type of the transaction applied {@link TransactionType}
     */
    public static ExecutedTransaction from(Transaction transaction, TransactionType type, Amount currentBalance) {
        return new ExecutedTransaction(type, transaction, currentBalance);
    }

    private ExecutedTransaction(TransactionType type, Transaction transaction, Amount balance) {
        this.type = type;
        this.transaction = transaction;
        this.balance = balance;
    }
}
