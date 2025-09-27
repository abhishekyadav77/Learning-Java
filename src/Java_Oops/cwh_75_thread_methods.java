package Java_Oops;
class mythr1 extends Thread{
    public mythr1(String name){
        super(name);
    }
    public void run(){
     //   int i = 34;
        //System.out.println("thank you" + this.getName());
        while(true){
            System.out.println("thank you" + this.getName());
        }
    }
}
class mynewthread2 extends Thread {
    public void run() {
        while (true) {


            System.out.println("Thank you for Thread 2");
        }
    }
}
public class cwh_75_thread_methods {
    public static void main(String[] args) {
mynewthread2 t1 = new mynewthread2();
mynewthread2 t2 = new mynewthread2();
t1.start();

try{
    t1.join();
}
catch (Exception e){
    System.out.println(e);
}
t2.start();

    }
}
