package Java_Oops;
class A{
    public int a;

    public int abhi5(){
        return 4;
    }
    public void met2(){
        System.out.println("Method 2 of class A");
    }
}
class B extends A{
  //  @Override
    // if the child class implements the same method present in the parent class again , it is known as method overriding
    public void met2(int a){
        System.out.println("Method 2 of class B");
    }
    public void met3(){
        System.out.println("Method 3 of class B");
    }
}
public class cwh_48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.met2();

        B b = new B();
        b.met2();
    }
}
