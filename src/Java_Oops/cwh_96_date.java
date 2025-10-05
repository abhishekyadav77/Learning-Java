package Java_Oops;

import java.util.Date;

public class cwh_96_date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        // Quiz
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
       // Creating date class Video 97
        Date d = new Date();
        System.out.println(d); // gives the current date and time
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());

    }
}
