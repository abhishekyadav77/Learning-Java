package Java_Oops;

import java.util.ArrayList;
import java.util.*;

public class cwh_92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(15);

        l2.add(17);
        l2.add(19);
        l1.addFirst(245); // adds element in the starting
        l1.add(6);
        l1.add(4);
        l1.add(5);
        l1.add(8);
        l1.add(6);
        l1.add(9);
        l1.addAll(0,l2);
        l1.addLast(7); // adds elements in the last
// l1.clear();
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(5));
        // checks that the array list is available or not
        l1.set(1, 23);  // sets the new number
        for (int i =0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
