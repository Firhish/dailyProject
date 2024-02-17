package quizzes.quiz2.q64;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        // "parse" and "of" methods create new instances
        // so in this case you get 4 different instance of LocalDate stored at 4 different memory addresses
        LocalDate d1 = LocalDate.parse("1999-09-09");
        LocalDate d2 = LocalDate.parse("1999-09-09");
        LocalDate d3 = LocalDate.of(1999, 9, 9);
        LocalDate d4 = LocalDate.of(1999, 9, 9);
        // compares memory locations, use .equals() instead
        System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));
    }
    
}
