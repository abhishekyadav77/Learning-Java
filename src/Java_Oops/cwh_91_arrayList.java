package Java_Oops;
import java.util.*;

public class cwh_91_arrayList {
    public static void main(String[] args) {
ArrayList<Integer> l1 = new ArrayList<>();
l1.add(6);
l1.add(4);
l1.add(5);
l1.add(8);
l1.add(6);
l1.add(9);
        System.out.println(l1.contains(5)); // checks that the array list is available or not
for (int i =0; i<l1.size(); i++){
            System.out.println(l1.get(i));
}
    }
}
