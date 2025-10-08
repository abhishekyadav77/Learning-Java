package Java_Oops;

import java.util.ArrayList;
import java.util.Scanner;
class mygenerics<T1>{
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    int val;
    private T1 t1;

    public mygenerics(int val , T1 t1) {
        this.val = val;
        this.t1 = t1;

    }
}
public class cwh_110_JavaGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
      //  ArrayList<Int> arrayList = new ArrayList();--- this will throw an error
      //  arrayList.add("Str1");
        arrayList.add(23);
        arrayList.add(78);
        arrayList.add(34);
       // arrayList.add(new Scanner(System.in));
        int a = arrayList.get(0);
        System.out.println(a);
        mygenerics g1 = new mygenerics<>(23, "My string");
        String str = g1.getT1().toString();
        System.out.println(str);


    }
}
