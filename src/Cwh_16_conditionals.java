import java.util.Scanner;
public class Cwh_16_conditionals {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age in numbers :");
        int age = sc.nextInt();
        if (age>18) {
            System.out.println("Yes , you can drive");
        }
            else{
                System.out.println("No, you are unable to drive");
            }
    }
}
