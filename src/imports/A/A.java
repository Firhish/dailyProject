package imports.A;
import static imports.A.SubA.A2.str;

import imports.A.SubA.A2;
public class A {

    public static void main(String[] args) {

        System.out.println(str);
        System.out.println(str());

        System.out.println(new A2());
        
    }
    
}
