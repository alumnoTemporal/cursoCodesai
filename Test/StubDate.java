import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Usuario on 11/10/2016.
 */
public class StubDate extends Date {


    private boolean callToString = false;

    public java.util.Date currentDate(){
        try {
            return (new SimpleDateFormat("yyyy-MM-dd")).parse("2007-12-25");
        } catch (ParseException e) {

        }
        return null;
    }



    @Override
    public String toString(){
        callToString = true;

        return currentDate().toString();
    }


    public boolean isCallToString() {
        return callToString;
    }
}
