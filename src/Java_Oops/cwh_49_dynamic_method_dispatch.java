package Java_Oops;
class one{

public void greet() {
    System.out.println("Good Morning");
}
public void name() {
    System.out.println("Java");
}
        }
        class two extends one{
    public void Swagat(){
        System.out.println("Aapka swagat hai");
    }
    public void name(){
        System.out.println("My name is Java in Class Two");
    }
        }

public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
       // one a = new one();
        //a.name();
        //two b = new two();
one a = new two(); // yes it is allowed
        //two b = new one(); // it is not allowed

        a.greet();
        a.name(); // This prints the Class two not one
        // method is decided on the run time . which method  will run on the run time........ this is called dynamic method dispatch

    }
}
