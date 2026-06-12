import java.util.Arrays;

public class ArraysRev {
    public static void main(String[] args){
        int age = 30;
        int physics = 80;
        int chemistry = 90;
        System.out.println(age);
//        int [] marks = new int [3];
//        marks[0]= 97;
//        marks[1]= 55;
//        marks[2]= 60;

        int[] marks = {97, 98, 95};

//        2D array
        int [][] finalmarks = {{2,3,5}, {45,98,75}};

        System.out.println(marks.length);
        System.out.println(marks[1]);
        Arrays.sort(marks);
        System.out.println(marks[1]);
        System.out.println(finalmarks[1][1]);

        double price = 100.00;
        double finPrice = price+18;

        int p = 100;
        int fp = p+ (int)18.0;
        System.out.println(finPrice);
        System.out.println(fp);
    }
}
