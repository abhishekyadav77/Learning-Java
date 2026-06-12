public class cwh_27_arrays_properties {
    public static void main(String[] args) {
       // int [] marks = {98,85,97,45,74,67};
        float [] marks = {98.3f,85.6f,97,45,74.5f,67};
//String [] students= {"abhishek", "raj","Shubham"};
//        System.out.println(marks[4]);
//        System.out.println(students[2]);
//        System.out.println(marks.length);  // to find the length of marks
//         printing an array using for loop

//        for(int i=0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }
        System.out.println("Printing array in reverse order");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
        System.out.println("printing an array by using for each loop");
        for (float element: marks){
            System.out.println(element);
        }

    }
}
