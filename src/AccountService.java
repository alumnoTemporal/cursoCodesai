/**
 * Created by Usuario on 11/10/2016.
 */
public class AccountService {

    private Account account;


    public AccountService(Account account) {
        this.account = account;
    }

    public void deposit(int amount) {
        account.addAmount(amount);

    }

    public void withdraw(int amount) {
        account.extractAmount(amount);
    }

    public void printStatement() {
    }

}
