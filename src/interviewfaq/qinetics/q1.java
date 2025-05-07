package interviewfaq.qinetics;

import java.util.Random;

public class q1 {

    static String[] arrQ1 = getCompleteArr();
 

    private static char getAlphanumeric() {

        char c = 0;

        switch (1 + new Random().nextInt(3)) {
            case 1:
                c = '\u0030';
                return c += (new Random().nextInt(9));

            case 2:
                c = '\u0041';
                return c += (new Random().nextInt(19));

            case 3:
                c = '\u0061';
                return c += (new Random().nextInt(19));
        }

        return c;
    }

    private static String getRandomString() {

        int size = 10 + new Random().nextInt(5);
        String temp = "";

        for (int i = 0; i < size; i++) {
            temp += getAlphanumeric();
        }

        return temp;
    }

    private static String[] getCompleteArr(){

        String[] arr =  new String[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomString();
        }

        return arr;

    }

    public static void main(String[] args) {
        for (String string : arrQ1) {
            System.out.println(string);
        }
    }

}
