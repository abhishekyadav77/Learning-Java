public class CWH_17_logicalOperators {
    public static void main(String args[]){
        //logical operators in java are - &&- AND , || - OR , ! - NOT
        boolean a = true;
        boolean b = false;
        if ( a && b){
            // for and operator both are true
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("Logical OR");
        if (a||b){
            //For OR operation if one condition is true then it is true otherwise it is false
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
    //    similary for NOT operator if one is false the it will becomes true , or say that it is a reversal operator
    }

}
