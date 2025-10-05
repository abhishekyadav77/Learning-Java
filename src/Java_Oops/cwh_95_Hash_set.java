package Java_Oops;

import java.util.HashSet;

public class cwh_95_Hash_set {
    public static void main(String[] args) {
        HashSet<Integer> myhasset = new HashSet<>(6, 0.5f);
        myhasset.add(6);
        myhasset.add(5);
        myhasset.add(4);
        myhasset.add(34);
        myhasset.add(23);
        System.out.println(myhasset);

    }
}
