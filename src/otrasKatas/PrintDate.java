package otrasKatas;

/**
 * Created by Usuario on 11/10/2016.
 */
public class PrintDate {

    private Date date;
    private Console consoleMock;

    public PrintDate(Date date, Console consoleMock){

        this.date = date;
        this.consoleMock = consoleMock;
    }

    public  void printCurrent(){
    //    System.out.println(date);
        consoleMock.println(date.currentDate());


    }


}
