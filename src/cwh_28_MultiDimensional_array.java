public class cwh_28_MultiDimensional_array {
    public static void main(String[] args) {
        int[] marks;       // 1-d array
        int[][] flats;       // 2-d array
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 201;

        System.out.println("Printing a 2-D array");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
        // this is a way to print a multidimensional loops, here the loops are used very strictly and carefully

    }
}
