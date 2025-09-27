package Java_Oops;
class practice13 extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}
class practice13b extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

public class cwh_76_PS {
    public static void main(String[] args) {
    practice13 p = new practice13();
    practice13b p2 = new practice13b();
    p.setPriority(7);
    p2.setPriority(2);
//       System.out.println(p2.setPriority());
    p.start();
    p2.start();
p.getState();

    }

}
