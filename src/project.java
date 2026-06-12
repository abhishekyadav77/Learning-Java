import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        int mynumber = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);

        int usernumber;


        do {
            System.out.println("Guess My number");
            usernumber = sc.nextInt();
            if (usernumber == mynumber) {
                System.out.println("you have guessed it rught");
            } else if (usernumber > mynumber) {
                System.out.println("your number is large");

            } else {
                System.out.println("Your number is small");
            }
        }
            while (usernumber >= 0) ;

                System.out.print("My number was");
                System.out.println(mynumber);



    }
}


