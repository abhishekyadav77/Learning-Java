package Java_Oops;

/**
 * This class is to demonstrate what java docis and how it is implemented in industry
 * This is <i>italic</i> word <p> this is a new paragraph</p>
 * @author  Abhishek (Abhishek Yadav)
 * @version  0.7
 * @since 2002
 * @see java doc
 *
 *
 */

public class cwh_107_Methods_of_Javadoc {
    /**
     *
     * @param args This is used for arguments
     */
    public static void main(String[] args) {
        System.out.println("Iam Main MEthod");
/**
 * @param i This is first number to add
 * @param j This is second number to add
 * @return Sum of two numbers as an integer
 * @throw Exception if i is 0
 * @deprecated This method is depricated please use + operator
 */
    }
    public int add (int i , int j) throws Exception{
        if (i==0){
            throw new Exception();
        }
int c;
c = i+ j;
return c;

    }
}
