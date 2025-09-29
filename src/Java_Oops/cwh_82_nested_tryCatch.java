package Java_Oops;

import java.util.Scanner;

public class cwh_82_nested_tryCatch {
    public static void main(String[] args) {
        int [] marks = new int [5];
        marks[0]= 7;
        marks [1] = 39;
        marks [2] = 48;
        marks [3] = 83;
        marks [4] = 32;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int ind = sc.nextInt();
        try{
            System.out.println("Vodeo 82");
            try{
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception not exist");
            }
        }
        catch ( Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
