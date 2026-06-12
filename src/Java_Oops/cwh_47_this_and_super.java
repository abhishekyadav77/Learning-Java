package Java_Oops;
class EkClass{

    int a;

    public int getA() {
        return a;
    }

    EkClass(int v){
        this.a = v;

    }

    // this keyword is a way for us to reference an object of the class which is being created / referenced

    public int returnone(){
        return 1;

    }
}
class doclass extends EkClass{
    doclass(int c){
        super (c);
        System.out.println("I am a constructor");
    }
}
public class cwh_47_this_and_super {
    public static void main(String[] args) {
       EkClass e = new EkClass(7);
        System.out.println(e.getA());
        doclass d= new doclass(6);
        System.out.println(e.getA());

    }
}
