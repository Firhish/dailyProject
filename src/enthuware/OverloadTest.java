package enthuware;

public class OverloadTest {


    public static void sayHello(){
        System.out.println("Hello");
    }

    // public void sayHello(){                  // cannot have a method with the same signature (even with different modifier and return type) 
    //     System.out.println("Hello");
    // }

    public static void main(String[] args) {

        sayHello();
        // new OverloadTest().sayHello();
        
    }
    
}
