package Java_Oops;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class cwh_98_Calender {
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        Calendar c = Calendar.getInstance();

        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        // video 99
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2021));
        System.out.println(TimeZone.getAvailableIDs());
    }
}
