package otrasKatas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Usuario on 11/10/2016.
 */
public class PrintDateTest {

/*
    @Test
    public void imprimir(){

        new otrasKatas.PrintDate(new otrasKatas.Date(), System.out ).printCurrent();
    }
*/

    @Test
    public void comprobarImpresionFecha(){
        StubDate stubDate = new StubDate();
        ConsoleMock consoleMock = new ConsoleMock();

        new PrintDate(stubDate, consoleMock).printCurrent();

        assertEquals(stubDate.currentDate(), consoleMock.dataPrint());
    }

    @Test
    public void productionCode(){
        new PrintDate(new Date(), new Console());
    }







}
