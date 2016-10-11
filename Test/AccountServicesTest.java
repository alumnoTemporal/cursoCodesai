/**
 * Created by Usuario on 11/10/2016.
 */
import org.junit.Test;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;




public class AccountServicesTest {


    @Test
    public void should_print_statement_containing_all_transactions() {
        account.deposit(1000);
        account.withdraw(100);
        account.deposit(500);

        account.printStatement();

        verify(console).printLine("DATE | AMOUNT | BALANCE");
        verify(console).printLine("10/04/2014 | 500 | 1400");
        verify(console).printLine("02/04/2014 | -100 | 900");
        verify(console).printLine("01/04/2014 | 1000 | 1000");
    }




}
