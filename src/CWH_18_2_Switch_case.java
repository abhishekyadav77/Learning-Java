import java.sql.SQLOutput;
import java.util.Scanner;
public class CWH_18_2_Switch_case{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.println("Enter Your age");
        age = sc.nextInt();
        switch(age) {
            // here enhances switch statement is also used to short the code
            case 18:
                System.out.println("Your are going to be adult");
                break;

            case 23:
                System.out.println("Your are gong to join a job");
                break;
            case 60:
                System.out.println("You are going to be Retired");
                break;
            default:
                System.out.println("Enjoy your Life");
        }
        System.out.println("Thank You");
    }
}