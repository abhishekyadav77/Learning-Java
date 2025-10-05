package Java_Oops;

import java.util.ArrayDeque;

public class cwh_93_Array_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(7);
        ad1.add(56);
        ad1.addFirst(6);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
