import java.util.Scanner;
public class Percantage_Calculator {
    public static void main(String[] args){
        System.out.println("Percentage Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total no. Of marks");
        System.out.println("Enter all Subject marks ....if no. of subjects is not available put 0");
        int Total_Marks = sc.nextInt();
        System.out.println("Enter Subject 1 Marks");
        int sub1 = sc.nextInt();
        System.out.println("Enter Subject 2 Marks");
        int sub2 = sc.nextInt();
        System.out.println("Enter Subject 3 Marks");
        int sub3 = sc.nextInt();
        System.out.println("Enter Subject 4 Marks");
        int sub4 = sc.nextInt();
        System.out.println("Enter Subject 5 Marks");
        int sub5 = sc.nextInt();
        System.out.println("Enter Subject 6 marks");
        //System.out.println("Enter sixth subject marks if total marks entered 600....Otherwise Enter 0");
        int sub6 = sc.nextInt();
        int total = sub1+sub2+sub3+sub4+sub5+sub6;
        System.out.println("The total no. of marks is" +total);
        float percentage = ((float) total/Total_Marks)*100;
        System.out.println("Percentage is " +percentage +"%");
    }
}
