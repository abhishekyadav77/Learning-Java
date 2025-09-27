package Java_Oops;
class mythreadrunnable implements Runnable{
    public void run(){
        System.out.println("Ia am a Thread");
        System.out.println("Ia am a Thread");
        System.out.println("Ia am a Thread");
        System.out.println("Ia am a Thread");
        System.out.println("Ia am a Thread");
        System.out.println("Ia am a Thread");
        System.out.println("Ia am a Thread");
        System.out.println("Ia am a Thread");
        System.out.println("Ia am a Thread");
        System.out.println("Ia am a Thread");
        System.out.println("Ia am a Thread");
    }
}
class mythreadrunnable2 implements Runnable{
    public void run(){
        System.out.println("Ia am a Thread 2");
        System.out.println("Ia am a Thread 2");
        System.out.println("Ia am a Thread 2");
        System.out.println("Ia am a Thread 2");
        System.out.println("Ia am a Thread 2");
        System.out.println("Ia am a Thread 2");
        System.out.println("Ia am a Thread 2");
        System.out.println("Ia am a Thread 2");
        System.out.println("Ia am a Thread 2");
        System.out.println("Ia am a Thread 2");
        System.out.println("Ia am a Thread 2");
    }
}

public class cwh_71_runnable_interface {
    public static void main(String[] args) {
mythreadrunnable bullet1 = new mythreadrunnable();
Thread gun1 = new Thread(bullet1);

mythreadrunnable2 Bullet2 = new mythreadrunnable2();
Thread gun2 = new Thread(Bullet2);
//        bullet1.run();
//        Bullet2.run();
            gun1.start();
            gun2.start();
    }
}
