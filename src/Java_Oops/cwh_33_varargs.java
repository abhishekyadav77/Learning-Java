package Java_Oops;

public class cwh_33_varargs {
//    static int sum(int a, int b) {
//        return a + b;
//    }
//    static int sum (int a, int b , int c) {
//            return a + b + c;
//        }
//        static int sum(int a, int b, int c, int d){
//                return a+b+c+d;
//    }
    static int sum(int ... arr){
        //available as int[] arr
        int result =0;
        for (int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the world of java");
        System.out.println("The sum of 4  and 5 is " + sum( 4,5));
        System.out.println("The sum of 4, 5 and 8 is " +sum(4,5,6));
        System.out.println("the sum of 2 , 7, 8, 9 is" +sum(4,8,9, 2));


    }
}
