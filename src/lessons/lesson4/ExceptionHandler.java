package lessons.lesson4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandler {

    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            FileInputStream file = new FileInputStream("/src/lessons/lesson4/myfile.txt");
        } catch (FileNotFoundException e) {
            // Exception handling
            System.out.println("File not found: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Cleanup code
            System.out.println("Finally block executed.");
        }
    }

}
