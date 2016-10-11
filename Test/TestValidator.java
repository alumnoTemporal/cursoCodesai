/**
 * Created by Usuario on 11/10/2016.
 */

import org.junit.Test;
import static org.junit.Assert.*;


public class TestValidator {

    @Test
    public void passwordHasMore8charcracters(){
        Validator validator = new Validator();

        String pass = "123456789";
        boolean isMoreCharacter =  validator.isMoreEightCharacters(pass);

        assertTrue(isMoreCharacter);



    }




}
