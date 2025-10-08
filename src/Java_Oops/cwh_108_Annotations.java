package Java_Oops;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

class abhi2 {
    public void  class1(){
        System.out.println("I am class 1");
    }
    class abhi3 extends abhi2 {
       @Override
        public void class1(){
            System.out.println("Good morning");
        }
    }

}
// Annotations are used to provide extra information about a program, annotations provides metadata to class methods
// few annotations are override, depracated, functional interface, etc
public class cwh_108_Annotations {
    public static void main(String[] args) {
abhi2 abhi = new abhi2();
abhi.class1();

    }
}
