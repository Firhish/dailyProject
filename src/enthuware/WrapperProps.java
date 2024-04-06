package enthuware;

import java.util.ArrayList;
import java.util.List;

public class WrapperProps {

    // Wrapper class
    // 0. Intro to wrapper
    // 1. Autoboxing (automatic conversion from primitive to wrapper and vice versa)
    // 2. Purpose (usage in array list)
    // 3. Integer caching
    // 4. Method overloading

    public static void main(String[] args) {
        Integer d1 = new Integer(1);
        Integer d2 = new Integer(1);
        Integer d3 = 1;
        Integer d4 = 1;

        System.out.println(d1.equals(d2)); // compare primitive value
        System.out.println(d1 == d2);      // compare memory loc
        System.out.println(d3.equals(d4)); // compare primitive value
        System.out.println(d3 == d4);      // compare memory loc (no pooling/interning)
    }

    
}
