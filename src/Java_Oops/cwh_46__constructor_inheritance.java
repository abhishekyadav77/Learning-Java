package Java_Oops;
class base1 {
    base1() {
        System.out.println("This is Constructor ");
    }

     base1(int a) {
            System.out.println("This is a overloaded  Constructor with valur a " +a);
        }
    
//    public int x;
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getX() {
//        return x;
//    }
}
class derived1 extends base1{
    derived1(){
     //   super (0);
        System.out.println("Im constructor of derived class");
    }
    derived1 (int b){

        System.out.println("I am derived 1 class constructor");
    }

//    public int y;
//    public int getY(){
//        return y;
//    }
//
//    public void setY(int y){
//        this.y =y;
//    }
}
public class cwh_46__constructor_inheritance {
    public static void main(String[] args) {
        base1 b = new base1();

        derived1 c = new derived1(14);

    }
}
