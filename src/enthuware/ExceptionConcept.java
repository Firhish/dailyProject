package enthuware;

import java.io.FileNotFoundException;

public class ExceptionConcept{

    public static void m1() throws Exception{

        // throw new Exception();
        
    }

    public static void m2() throws Exception{
        
        try {
            m1();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args){

        try{
            m2();
        }
        catch(Exception e){

        }
         finally{
            System.out.println("Finally");
        }

    }
}