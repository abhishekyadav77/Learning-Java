package Java_Oops;
class mythread1 extends Thread{
    public void run(){
        int i =0;
        while (i<100){
            System.out.println("My thread is running");
            System.out.println("Ia am happy");
        i++;
        }
    }
}
class mythread2 extends Thread{
    public void run(){
        int i =0;

        while(i<100){
            System.out.println("Thread 2");
            System.out.println("I am sad");
        i++;
        }
    }
}
public class cwh_70_multithreading {
    public static void main(String[] args) {
mythread1 t1 = new mythread1();
mythread2 t2 = new mythread2();
t1.start();
t2.start();

    }
}
