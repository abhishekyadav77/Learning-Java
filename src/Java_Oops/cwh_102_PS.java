package Java_Oops;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class cwh_102_PS {
    public static void main(String[] args) {
        // PS 1
        ArrayList ar = new ArrayList<>();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        for (Object o:ar){
            System.out.println(o);
        }
// PS 5
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(9);
        s.add(8);
        s.add(2);
        s.add(6);
        s.add(34);
        System.out.println(s);
        //PS 2
        Date d = new Date();
        System.out.println(d.getHours()+ ":" +d.getMinutes() +":" + d.getSeconds());

    }


}
