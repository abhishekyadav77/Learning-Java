package Java_Oops;

class Circle2{
    Circle2(){
        System.out.println("I am non parameterized constructor");
    }
    Circle2(int r){
        System.out.println("I am circle parametrized constructor");
        this.radius=r;
    }
    public int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle2{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parametrized constructor");
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class cwh_52_PS_10 {
    public static void main(String[] args) {

        //problem 1

//        Circle2 objc= new Circle2(12);
        Cylinder1 obj = new Cylinder1(7,8);
    }
}
