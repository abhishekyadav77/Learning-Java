package Java_Oops;

class Employee1 {
    String name;

    int salary;


    public int get_salary() {
        return salary;

    }

    public String get_name() {
        return name;
    }
    public void set_name(String n){
         name = n;

        }
    }
class phone{
    public void ringing(){
        System.out.println("Ringing.....");
    }
    public void vibrating(){
        System.out.println("Vibrating......");
    }
}
class square{
    int side;
    public int area(){
        return side*side;

    }
    public int perimeter(){
        return 4*side;

    }
}

public class cwh_39_PracticeSet {

    public static void main(String[] args) {
Employee1 abhi = new Employee1();
abhi.set_name("Abhishek");
        System.out.println(abhi.get_name());

abhi.salary= 56000;
        System.out.println(abhi.get_salary());

        phone V = new phone();
        V.ringing();
        V.vibrating();
        System.out.println();
square sq1 = new square();
sq1.side = 5;
        System.out.println("The area of square is " + sq1.area());
        System.out.println("The perimeter of Square is " + sq1.perimeter());

sq1.perimeter();

    }
}
