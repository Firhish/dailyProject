package enthuware;

public class IntegralAndFloatCompare {

    public static void main(String[] args) {

        System.out.println(0 == 0.0);                // identical
        System.out.println(1 == 1.0000000000000001); // identical if more than 15 decimal places

        System.out.println(0 == -0);                 // signed and unsigned ZERO are identical
        System.out.println(1 == -1);                 // not identical

        
    }
}
