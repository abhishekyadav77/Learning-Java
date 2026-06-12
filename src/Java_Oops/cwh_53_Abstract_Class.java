package Java_Oops;
abstract class Parent3{
    public void Parent32(){
        System.out.println("I am constructor of Base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Child2 extends Parent3{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}
abstract class child3 extends Parent3{
    public void th(){
        System.out.println("I am Good");
    }
}
public class cwh_53_Abstract_Class {
    public static void main(String[] args) {
        //  Parent3 p = new Parent3(); // Throws an error
        Child2 ch = new Child2();
    // child3 c3 = new Child3();   Error
    }

}
