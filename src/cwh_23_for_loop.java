import java.util.Scanner;
public class cwh_23_for_loop{
    public static void main(String[] args){
       /* for (int i=1; i<=10; i++) {
            System.out.println(i);
        }*/
//Printing numbers between 1 to 10
            // printing n odd numbers
        /*  Scanner odd = new Scanner(System.in);
        System.out.println("Enter N to Print odd numbers");
int n = odd.nextInt();
     //   int n = 10;
        for (int i=0; i<n; i++){
            System.out.println(2*i+1);
        }  */
//Decrementing for loop
        /*  for(int i=5; i>0; i--){
            System.out.println(i);
        }  */
        Scanner natural = new Scanner(System.in);
        System.out.println("Enter N to print natural numbers reverse");
        int n = natural.nextInt();
        for(int i=n; i>0; i--){
            System.out.println(i);
        }
    }
}
