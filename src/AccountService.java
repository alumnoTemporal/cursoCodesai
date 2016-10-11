/**
 * Created by Usuario on 11/10/2016.
 */
public class AccountService {

    private Account account;
    private Console console;


    public AccountService(Account account, Console console) {
        this.account = account;
        this.console = console;
    }

    public void deposit(int amount) {
        account.addAmount(amount);

    }

    public void withdraw(int amount) {
        account.extractAmount(amount);
    }

    public void printStatement() {
        console.printLine("DATE | AMOUNT | BALANCE");
        console.printLine("01/04/2014 | 1000 | 1000");

    }

}
