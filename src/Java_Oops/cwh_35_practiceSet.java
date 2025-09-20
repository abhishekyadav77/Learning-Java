package Java_Oops;

public class cwh_35_practiceSet {
    //    static void multiplication(int n) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.format("%d X %d = %d \n", n, i, n * i);
//        }
//
//    }
//
//        static void pattern(int n){
//        for (int i = 0; i<n; i++){
//
//        for (int j = 0; j < i+1 ; j++){
//            System.out.print("*");
//
//        }
//            System.out.println();
//    }
//}
//static int sumRec(int n){
//        if (n== 1) {
//            return 1;
//        }
//        else{
//                return n +sumRec(n-1);
//
//        }
//}
    static void pattern2(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fibo(int n){
        if(n== 1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return fibo (n-1)+ fibo(n-2);
        }
    }

    public static void main(String[] args) {
        // multiplication(7);
// Problem 2
        // pattern(9);
        // problem 3
        //  int c = sumRec(9);
        //System.out.println(c);
        // problem 4
      //  pattern2(4);
        // problem 5
       int result=  fibo(9);
        System.out.println(result);

    }
}


