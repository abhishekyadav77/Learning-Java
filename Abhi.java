//import package abhi;
class c1{
    public int x= 3;
    protected int y= 7;
    int z= 5;
    private int a = 87;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(z);

    }
}
public class Abhi {
    public static void main(String[] args) {
        c1 c = new c1();
        System.out.println("I am class Abhishek");
 // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
 //       System.out.println(c.a);   it is in private modifier
        System.out.println(c.z);
    }
}