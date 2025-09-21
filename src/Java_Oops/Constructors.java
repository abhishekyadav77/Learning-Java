package Java_Oops;
class myMainEmployee {
   private int id ;
    private String name;
    int my_salary = 10000;
    public myMainEmployee(){
        id = 56;
        name = "My name here";
    }
    // QUIZ
    public myMainEmployee(int salary){
        my_salary= salary;

    }

    //
public myMainEmployee(String myname , int myid){
    id = myid;
    name = myname;
}


    public String get_name(){
        return name;
    }
    public void set_name(String n){
        name = n;
    }
    public int getId(){
        return id;

    }
    public int setId(int i){
        return id=i;

    }
}

public class Constructors {
    public static void main(String[] args) {
        //myMainEmployee abhi= new myMainEmployee("Abhishek Here" , 76);
        myMainEmployee abhi= new myMainEmployee();
        System.out.println();


//        abhi.set_name("Abhshek Yadav");
//        abhi.get_name()();
//        abhi.setId(32);
//        System.out.println(abhi.getId());
//        System.out.println(abhi.get_name());

        //QUIZ
       // abhi.salary;
        System.out.println(abhi.my_salary);
        
    }
}
