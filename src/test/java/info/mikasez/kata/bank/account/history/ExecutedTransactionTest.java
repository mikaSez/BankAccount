package info.mikasez.kata.bank.account.history;

import info.mikasez.kata.bank.account.Amount;
import info.mikasez.kata.bank.account.actions.Transaction;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ExecutedTransactionTest {

    @Test
    public void shouldPrintAValidStatement(){
        //ARRANGE
        ExecutedTransaction transaction = ExecutedTransaction.from(new MockTransaction(), new Amount(200L));
        String[] expectedResult = new String[]{"MOCK_TRANSACTION", "200"};
        //ACT
        String[] array = transaction.toPrintableArray();
        //ASSERT
        Assertions.assertThat(array).contains(expectedResult);

    }

    private class MockTransaction implements Transaction {

        @Override
        public Amount act(Amount balance) {
            return null;
        }

        @Override
        public String[] asStringArray() {
            return new String[]{"MOCK_TRANSACTION"};
        }
    }
}