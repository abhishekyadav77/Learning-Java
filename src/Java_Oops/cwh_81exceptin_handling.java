package Java_Oops;

import java.util.Scanner;

public class cwh_81exceptin_handling {
    public static void main(String[] args) {
        int [] marks = new int [5];
        marks[0]= 7;
        marks [1] = 39;
        marks [2] = 48;
        marks [3] = 83;
        marks [4] = 32;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();
        System.out.println("Enter number to divede");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is "+marks[ind]);
            System.out.println("The value of array value/ number is "+marks[ind]/number);
        }
        catch (Exception e){
            System.out.println("Some exception occured ");
        }
    }
}
