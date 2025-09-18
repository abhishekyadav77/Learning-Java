package Java_Oops;
// a method is a function written inside a class .
// we need to write a method inside a class
// method is used to perform a specific task throughout the program
// we dont need to write a same logic again and again in a program .once a method is created they will be used in entire program
public class cwh_31_array_methods {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {

        int a= 5;
        int b= 7;
        int c;

//        cwh_31_array_methods obj = new cwh_31_array_methods();
//        c= obj.logic(a,b);

        c = logic(a,b);
        System.out.println(c);

//        if (a>b){
//            c = a+b;
//        }
//        else {
//            c = (a+b)*5;
//        }



        int a1 = 23;
        int b1 = 6;
        int c1 ;

        c1 = logic(a1,b1);

//        if (a1>b1){
//            c1 = a1+b1;
//        }
//        else {
//            c1 = (a1+b1)*5;
//        }
        System.out.println(a +" " +b);
        System.out.println(c1);

    }
}
