package Java_Oops;
class mythr2 extends Thread{
    public mythr2(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        //System.out.println("thank you" + this.getName());
        while(true){
          System.out.println("thank you" + this.getName());
        }
    }
}
public class cwh74_thread_priorities {
    public static void main(String[] args) {
        mythr2 t1 = new mythr2("abhishek");
        mythr2 t2 = new mythr2("Abhishek2");
        mythr2 t3 = new mythr2("abhishek3");
        mythr2 t4 = new mythr2("Abhishek4(Important)");
        t4.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

       // System.out.println("The id of thread t is "+ t1.getId());
        //System.out.println("The name of thread t is "+ t1.getName());
    }
}
