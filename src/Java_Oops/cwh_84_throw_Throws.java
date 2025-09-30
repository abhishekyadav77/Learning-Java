package Java_Oops;
class negativeradiusException extends Exception{
    public String toString(){
        return "Radius cannot be negative";
    }
    public String getMessage(){
        return "I am get messaage";
    }
}
public class cwh_84_throw_Throws {
    public static double area(int r)throws negativeradiusException {
        if(r<0){
            throw new negativeradiusException();
        }
            double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a , int b ) throws  ArithmeticException {
// person 1
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
// person 2
        try {
//            int c =divide (6,0);
//            System.out.println(c);
            double ar = area(7);
            System.out.println(ar);
            }
        catch ( Exception e){
            System.out.println("Exception");
        }

    }
}
