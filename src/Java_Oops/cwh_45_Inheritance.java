package Java_Oops;
class Base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x){
        System.out.println("i am in base and setting x now");
        this.x = x;
    }

    public void printme(){
        System.out.println("I am Constructor");
    }
}
class derived extends Base{
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class cwh_45_Inheritance {
    public static void main(String[] args) {
    Base b = new Base();
    b.setX(45);
        System.out.println(b.getX());
        derived d = new derived();
        d.setY(90);
        System.out.println(d.getY());
    }
}
