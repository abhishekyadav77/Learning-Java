import java.util.Scanner;
public class CWH_18_elseif {
    public static void main(String args[]) {
        int age;
        System.out.println("Enter the Age ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age > 56) {
            System.out.println("You ARE Experienced");

        } else if (age > 46) {
            System.out.println("you are semi - experienced");
        } else if (age > 36) {
            System.out.println("You are semi - semi experienced");
        } else {
            System.out.println("You are FRESHER");
        }

        if(age<2){
            System.out.println("You are  a baby");
        }

    }
}
