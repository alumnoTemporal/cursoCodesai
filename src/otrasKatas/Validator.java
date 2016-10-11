package otrasKatas;

/**
 * Created by Usuario on 11/10/2016.
 */
public class Validator {


    public static boolean validate(String password) {
        return hasMoreThan8Characters(password) && hasCapitalLetter(password);
    }

    private static boolean hasCapitalLetter(String password) {
        return !password.toLowerCase().equals(password);
    }

    private static boolean hasMoreThan8Characters(String passwordOK) {
        return passwordOK.length() > 8;
    }
}
