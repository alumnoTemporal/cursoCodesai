import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Date;

/**
 * Created by Usuario on 11/10/2016.
 */
public class ConsoleMock extends Console {

    private Object data;


    public void println(Date date) {
        data = date;

        System.out.println(date);
    }

    public Object dataPrint() {
        return data;
    }
}
