import java.util.Scanner;
public class CWH_05_Taking_input {
    public static void main(String args[]){
        System.out.println("Taking Input from the user ");
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter Number 1:");
        int a = sc.nextInt();
        System.out.println("Enter Number 2:");
        int b = sc.nextInt();
        // here int, char float all are used as their requirement
        int sum = a+b;
        System.out.println("The sum of these number is " +sum);*/
        System.out.println("Checking the no is Integer or not");
        System.out.println("Enter Number:");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

    }
}
//here the boolean and scanner is used to taking input from the user
