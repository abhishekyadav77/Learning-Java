import java.sql.SQLOutput;
import java.util.Scanner;

public class CH4_Practice_set {
    public static void main(String args[]) {
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks in Physics");
        int ph = sc.nextInt();
        System.out.println("Enter Marks in Chemistry");
        int ch= sc.nextInt();
        System.out.println("Enter Marks in Mathematics");
        int m= sc.nextInt();
        int sum = ph + ch+m;
        float avg = sum / 3 ;
        System.out.println("Your Marlks is " +sum);
        if(avg>=40 && ph>=33 && ch>=33 && m>=33){
            System.out.println("Congratulations , Yo have been Passed");

        }
        else{
            System.out.println("Sorry , You have not been promoted");


        } */
        //Question 3
       // Scanner sc= new Scanner(System.in);
    //float tax =(float)0.00;
    //float income;


               /* System.out.print("Enter your annual income (in Lakhs): ");
                double income = sc.nextDouble();  // input in Lakhs

                double tax = 0;

                if (income <= 2.5) {
                    tax = 0;
                }
                else if (income > 2.5 && income <= 5.0) {
                    tax = (income - 2.5) * 0.05;
                }
                else if (income > 5.0 && income <= 10.0) {
                    tax = (2.5 * 0.05) + (income - 5.0) * 0.20;
                }
                else {
                    tax = (2.5 * 0.05) + (5.0 * 0.20) + (income - 10.0) * 0.30;
                }

                System.out.println("Your total income tax = " + tax + " Lakhs");


*/
Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
int day = sc.nextInt();


        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error input");
        }


    }
}
