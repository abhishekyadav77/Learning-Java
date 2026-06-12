public class cwh_24_break_statement {
    public static void main(String[] args){
        // Break and Continue using loops
        for(int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("Java is Great");
            if (i==2){
                System.out.println("Ending the loop");
                break;
                // the break statements is used to exit the loops, whether the condition is true or false

            }

        }
        System.out.println("Loops Ended");
        int j=0;
        while(j<55){
            System.out.println(j);
            j++;
            if(j==50){
                System.out.println("Loop Breaks");
                continue;
            }
        }
        //similarly for continue the loops skips the lower code and start executed the higher one
    }
}
