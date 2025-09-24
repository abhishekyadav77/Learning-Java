package Java_Oops;
interface sampleInterface{
    void meth1();
    void meth2();

}
interface childsampleinterface extends sampleInterface{

    void meth3();
    void meth4();
}
class mysampleclass implements childsampleinterface{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }

}

public class cwh_58_inheritance_in_interface {
    public static void main(String[] args) {

    }
}
