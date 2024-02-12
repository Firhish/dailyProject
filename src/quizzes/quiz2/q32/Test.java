package quizzes.quiz2.q32;

public class Test {
    private static void add(double d1, double d2){
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2){
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {

        // Any number data types can be autobox into primitive double value
        // double version
        add(10.0, new Integer(10));                 // double primitive + Integer object
        add(10.0,10.0);                                // double primitive + double primitive
        add(new Double(10.0), new Integer(10));  // Double object + Integer object

        // Only when both are Double object, then Double version method invoked 
        // Double version
        add(new Double(10.0), new Double(10.0)); // Double object + Double object
    }
    
}
