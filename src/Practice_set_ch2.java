import java.util.Locale;

public class Practice_set_ch2 {
    public static void main(String args[]){
        String name = "Abhishek";
        name= name.toLowerCase();
        System.out.println(name);
        //Problem 2
        String text = "hello World";
        System.out.println(text);
        //Problem 3
        String letter = "Dear <|name|>, THanks alot";
        letter= letter.replace("<|name|>" , "Abhi");
        System.out.println(letter);
        //here replace is used as a string name
         String replace = "To lower case";
         replace = replace.replace(" " ,"_" );

        System.out.println(replace);
        String mystring = "This string  contains  double and triple spaces ";
        System.out.println(mystring.indexOf("  "));

    }
}
