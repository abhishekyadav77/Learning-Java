package Java_Oops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_111_FileHandling {
    public static void main(String[] args) {
//      // code to create a new file
//        File myfile = new File("cwh111file.txt");
//        try {
//            myfile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create new file");
//            throw new RuntimeException(e);
//
//        }
//        // code to write a file
//        try {
//            FileWriter myfilewriter = new FileWriter("cwh111file.txt");
//            myfilewriter.write("This is our first file \n from this java course");
//          myfilewriter.close();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        File myfile = new File("cwh111file.txt");
//        try {
//            Scanner sc = new Scanner(myfile);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

// deleteing a file

        File myfile = new File("cwh111file.txt");
        if (myfile.delete()){
            System.out.println("I have deleted "+ myfile.getName());

        }
        else {
            System.out.println("Some error Occured");
        }

    }
}
