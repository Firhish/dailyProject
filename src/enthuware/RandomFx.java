package enthuware;

import java.util.Random;

public class RandomFx {
    public static void main(String[] args) {

        int x = 10;
        // x here is seeds to get reproducible result
        Random r = new Random(x);
        System.out.println(r.nextInt(r.nextInt(x)));

    }

}
