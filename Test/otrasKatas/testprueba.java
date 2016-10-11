package otrasKatas; /**
 * Created by Usuario on 09/10/2016.
 */

import org.junit.Test;
import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;


public class testprueba {


    @Test
    public void laPrueba(){
        assertTrue(true);
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
