public class cwh_29_ch_6_practiceSet {
    public static void main(String[] args){
// Question 1
//        float marks[] = {74.8f,85.9f,96.2f,45.4f,65.4f};
//        float sum = 0;
//        for (float elements: marks) {
//            sum = sum + elements;
//        }
//            System.out.println("The sum of all in a array is " + sum);
// Question 2
//        float marks[] = {74.8f,85.9f,96.2f,45.4f,65.4f};
//        float num = 85.9f;
//        boolean PresentInArray= false;
//        for (float elements: marks) {
//            if(num==elements){
//                PresentInArray= true;
//                break;
//            }
//        }
//        if(PresentInArray){
//           System.out.println("The value is present in array");
//    }
//        else {
//            System.out.println("The value is not present in array");
//        }
     //Question 3
//        float marks[] = {74.8f,85.9f,96.2f,45.4f,65.4f};
//        float sum = 0;
//        for (float elements: marks) {
//            sum = sum + elements;
//        }
//            System.out.println("The average marks of all in a array is "+sum/ marks.length);
    // Question 4
        int [][] mat1= {{1,2},{4,5}};
        int [][] mat2= {{2,5},{12,34}};
        int [][] sum= {{0,0},{0,0}};
        for(int i=0; i<mat1.length;i++) {  // row number of times
            for (int j = 0; j < mat1.length; j++) {   // column no. of times
                System.out.format("Setting value for i= %d and j= %d \n", i, j);
                sum[i][j] = mat1[i][j] + mat2[i][j];

                //  System.out.println(sum);
            }
        }
                for(int i=0; i<mat1.length;i++){  // row number of times
                    for (int j=0; j< mat1.length;j++){   // column no. of times
                        System.out.print(sum [i][j] + " ");
                        sum [i][j] = mat1[i][j] + mat2[i][j];
            }
                    System.out.println(" ");
        }

        }
}
