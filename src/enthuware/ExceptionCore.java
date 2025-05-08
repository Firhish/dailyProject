package enthuware;

import java.io.IOException;

public class ExceptionCore {

    // 1. Checked(compilation error) and Unchecked(Runtime error) (Hierarchy)
    // 2. Handle or Declare(Checked Exception) 
    // 3. Try catch finally


    public static void m1() throws IOException{
        // throw new IOException();
    }

    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("catched in main");
        } 
        finally{
            System.out.println("outside");
        } 
    }    
}


