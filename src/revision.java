public class revision {
    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.println("Hello Java");


        String name= "Abhishek";
        String neighbour= "aman";
        int age = 19;


        // Primitive datatypes
        byte ages = 90;
        long phone = 845965528854L;
        float pi = 3.14F;
        char letter = '@';
        boolean isadult = true;

        //non primitive

        String name2 = "Aman";
        System.out.println(name2.length());

        String friends = new String("abhi");
        System.out.println(friends);
        String concatenation = name + "and" + name2;
        System.out.println(concatenation);

        System.out.println(name.charAt(2));

        String ne = name.replace('h','b');
        System.out.println(ne);

        String nayaname = " aman and abhi";
        System.out.println(name.substring(2,7));








    }
}
