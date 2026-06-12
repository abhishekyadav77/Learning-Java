package Java_Oops;

import org.w3c.dom.ls.LSOutput;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen {
    void write() {
        System.out.println("Writing");
    }

    void refill() {
        System.out.println("Refill");
    }

    void changenib() {
        System.out.println("Changing the nib");
    }
}
    class monkey{
        void jump(){
            System.out.println("Jumping");
        }
        void bite(){
            System.out.println("Bitting");
        }
    }
    interface basicanimal{
    void eat();
    void sleep();
    }

class human extends monkey{
    void speak(){
        System.out.println("hello sir");
    }

    public void eat(){
        System.out.println("Eating");

    }

    public void sleep(){
        System.out.println("Sleeping");
    }
}
public class cwh_60_PS_CH11 {
    public static void main(String[] args) {
        fountainpen p = new fountainpen();
 p.changenib();
    human abhi = new human();
    abhi.sleep();

    monkey m1 = new human();   //polymorphism
    //  m1.speak();   --- Not speaks method because the reference monkey which does not have speak methods
    m1.bite();
    }
}


