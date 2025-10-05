package Java_Oops;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_dateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        //DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // Formatter
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E"); // Formatter
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        String mydate = dt.format(df);
        System.out.println(mydate);

    }
}
