package enthuware;

import java.util.Random; // from java.util package

public class RandomFx {
    public static void main(String[] args) {

        // Concept
        // 1. package (java.util)
        // 2. How to use (Instantiation)
        // 3. Seeds (reproducible)

        int x = 10;
        // x here is seeds to get reproducible result
        Random r = new Random();
        System.out.println(r.nextInt(x));
        System.out.println(r.nextDouble()); // 0.0 to 1.0

    }

}
