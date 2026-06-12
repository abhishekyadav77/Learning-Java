package Java_Oops;

public class cwh_34_recursion {
    public static void main (String[] args){
        int n = 4;
        System.out.println("The value of factorial n is " + factorial(n));

    }

    static int factorial(int n) {
        // factorial = n*(n-1)*.....1
        //factorial (5) = 5*4*3*2*1;
        // fact(n) = n*factorial(n-1)
        // factorial 0 = 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);

        }


    }
}



