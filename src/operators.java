import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        double a= 5;
        double b= 3;
        double modulos = a%b;

        int numb= 1;

//        System.out.println(modulos);

        System.out.println(numb--);
        System.out.println(numb);

        System.out.println(Math.max(4,98));
        System.out.println((int)(Math.random()*100));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Your age is " +age);





    }
}
