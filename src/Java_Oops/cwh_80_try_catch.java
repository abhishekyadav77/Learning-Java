package Java_Oops;

public class cwh_80_try_catch {
    public static void main(String[] args) {
        int a =6000;
        int b= 0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("We failed to divide");
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
