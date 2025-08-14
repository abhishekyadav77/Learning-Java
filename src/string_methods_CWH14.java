public class string_methods_CWH14 {
    public static void main(String args[]){
        String name = "Abhishek";
        int value = name.length();
        String lstring = name.toLowerCase();
        String ustring = name.toUpperCase();
        System.out.println(name);
        System.out.println(value);
        System.out.println(lstring);
        System.out.println(ustring);
        String nontrimmedstring = "    Abhi     ";
        System.out.println(nontrimmedstring);
        String trimmedstring = nontrimmedstring.trim();
        System.out.println(trimmedstring);
//Escape sequence characters
        // escape sequence characters are \n, \t, \ etc
        System.out.println("Iam escape sequence \ndouble quote");

    }
}
// the different string methods are available in java
//we are not using all the string methods in this program