/**
 * Created by Usuario on 11/10/2016.
 */
import org.junit.Ignore;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class AccountServicesTest {


    @Test @Ignore
    public void should_print_statement_containing_all_transactions() {
        Account account = mock(Account.class);
        AccountService accountService = new AccountService(account);
        Console console = new Console();

        accountService.deposit(1000);
        accountService.withdraw(100);
        accountService.deposit(500);

        accountService.printStatement();

        verify(console).printLine("DATE | AMOUNT | BALANCE");
        verify(console).printLine("10/04/2014 | 500 | 1400");
        verify(console).printLine("02/04/2014 | -100 | 900");
        verify(console).printLine("01/04/2014 | 1000 | 1000");
    }

    @Test
    public void deposit_1000_in_the_count(){
        Account account = mock(Account.class);
        AccountService accountService = new AccountService(account);

        accountService.deposit(1000);

        verify(account).addAmount(1000);
    }

    @Test
    public void withdraw_100_in_the_count(){
        Account account = mock(Account.class);
        AccountService accountService = new AccountService(account);

        accountService.withdraw(100);

        verify(account).extractAmount(100);
    }

    @Test
    public void print_statement(){
        Account account = mock(Account.class);
        AccountService accountService = new AccountService(account);

        accountService.withdraw(100);

        verify(account).extractAmount(100);
    }
 /*
    public class Test
    {

        public static void main(String[] args)
        {
            ClaseA ca = mock(ClaseA.class);
            ClaseB cb =new ClaseB();
            cb.setCa(ca);
            cb.met1();
            Mockito.verify(ca, Mockito.times(2)).fonc1();
            Mockito.verify(ca, Mockito.times(1)).fonc3( Mockito.anyInt(), Mockito.anyInt());
        }
        */


}
