package Java_Oops;
// method overloading is a method by which two or more methods can have same name but different parameters, such methods are overloaded methods
public class Cwh_32_Method_overloading {

    // this is a method
    static void foo(){
        System.out.println("Good Morning ");
    }
    static void foo(int a){
        System.out.println("Good morning"+a+"Bro");
    }
    // the upper foo is two methods having same name but they passes different parameters

    static void array(int arr[]){
        arr[0]= 95;
    }
    static void change(int a){
        a = 55;
    }
    static void telJoke(){
        System.out.println("I invented a new world!");
    }
// when we dont want our method to return anything we use void as the return type

    public static void main(String[] args) {
     //   telJoke();
       int marks[] = { 76,98,64,86,87};

       // changing the integer....here the integer can not be changed because the methods gave only copy


//       int x= 45;
//       change(x);
//        System.out.println("The value of x after running change is "+x);


// changing the array in methods

//array(marks);
//        System.out.println(marks[0]);
        foo();
        foo(2000 );// 2000 is a arguments and int a is a parameter
        // argument is actual

    }
}
