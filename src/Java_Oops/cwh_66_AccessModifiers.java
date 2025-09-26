package Java_Oops;
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
public class cwh_66_AccessModifiers {
    public static void main(String[] args) {
    c1 c = new c1();
   // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
 //       System.out.println(c.a);   it is in private modifier
        System.out.println(c.z);
    }
}
  /*   Access Levels
Modifier	Class	Package	Subclass	World
public	      Y	        Y        Y	      Y
protected	  Y      	Y	     Y      	N
no modifier	  Y      	Y	     N      	N
private      	Y	    N        N      	N
*/