package Java_Oops;

class my_employee {
    int id ;
    private String name;
     public String get_name(){
         return name;
     }
     public void set_name(String n){
         name = n;
     }
     public int getId(){
         return id;

     }
    public int setId(int i){
        return id=i;

    }
}
public class Cwh_40_access_modifiers {
    public static void main(String[] args) {
my_employee abhi= new my_employee();
//abhi.id = 21;
//abhi.name = "Abhishek yadav";    throwa an error because name is protected
abhi.set_name("Abhishek");
        System.out.println(abhi.get_name());
        abhi.setId(462);

        System.out.println(abhi.getId());
    }
}
