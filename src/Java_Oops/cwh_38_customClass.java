package Java_Oops;
 class employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("My name is " +name);
        System.out.println("My salary is "+ salary);
    }
public int get_salary(){
        return salary;
}
}
public class cwh_38_customClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee abhi = new employee();  // instantiating a new employee object
       // setting attributes
        abhi.id= 21;
        abhi.name= "codeWithAbhishek";
        abhi.salary= 45000;

        employee abhi2 = new employee();
        abhi2.id = 34;
        abhi2.name= "Abhinav";
        abhi2.salary= 40000;

//       printing the attributes
        abhi.printDetails();
        abhi2.printDetails();
        int salary = abhi.get_salary();
        System.out.println(salary);
//        System.out.println(abhi.id);
//        System.out.println(abhi.name);

    }

}
