package otrasKatas; /**
 * Created by Usuario on 11/10/2016.
 */

import org.junit.Test;
import static org.junit.Assert.*;


public class TestValidator {

    @Test
    public void passwordOk(){
        String passwordOK = "Pa55word_";
        assertTrue(Validator.validate(passwordOK));
    }

    @Test
    public void passwordHasEigthCharacters(){
        String password = "Pa55wod_";
        assertFalse(Validator.validate(password));
    }

    @Test
    public void passwordHasLessThanEigthCharacters(){
        String password = "Pa55wd_";
        assertFalse(Validator.validate(password));
    }

    @Test
    public void doesntContainscapitalLetters(){
        String password = "pa55word_";
        assertFalse(Validator.validate(password));
    }


}
