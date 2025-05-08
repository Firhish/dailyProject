package refresher.Exception;

import java.io.IOException;

public class Exception1 {

    public void z1(){

        try{
            throw new IOException("ini semua salah ismail");
        }
        catch(IOException ismail){
            System.out.println(ismail.getMessage());
        }

    }

    public void z2(String x){
        System.out.println(x);
    }

    public static void main(String[] args) {
        new Exception1().z1();
    }

}
