package File_readers;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class als {
public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
    System.out.println( Integer.parseInt(sdf.format(cal.getTime())) );
}
}
