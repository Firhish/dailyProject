package enthuware;

import java.io.FileNotFoundException;

public class ExceptionConcept{

    public static void m1() throws FileNotFoundException{

        throw new FileNotFoundException();
        
    }

    public static void m2() throws FileNotFoundException{
        
        try {
            m1();
        } 
        catch (Exception e) {
            System.out.println("Error catched in m2");
        }

    }

    public static void m3() throws NullPointerException{}

    public static void main(String[] args) throws Exception{

        try{
            m2();
        }
        catch(Exception e){
            System.out.println("Error catched in main");
        }
         finally{
            System.out.println("Finally");
        }

        m3(); // No compilation error because of the unchecked exception

    }
}