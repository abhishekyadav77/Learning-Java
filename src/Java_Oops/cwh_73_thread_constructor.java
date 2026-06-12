package Java_Oops;
class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("thank you");
//        while(true){
//            System.out.println("I am Thread");
//        }
    }
}
public class cwh_73_thread_constructor {
    public static void main(String[] args) {
        mythr t = new mythr("abhishek");
        t.start();
        System.out.println("The id of thread t is "+ t.getId());
        System.out.println("The name of thread t is "+ t.getName());

    }
}
