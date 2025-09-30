package Java_Oops;

import java.util.Scanner;

class myException extends Exception{
    public String toString(){
        return "i am toString";
        }
        public String getMessage(){
        return "I am get messaage";
    }
}
public class cwh_83_exception_class {
    public static void main(String[] args) {
        int a =8;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<99){
            try {

               throw new myException();
            //throw new ArithmeticException("This is arithmetic exception");
            }
            catch (myException e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();

            }
        }

    }
}
