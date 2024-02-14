package quizzes.quiz2.q36;

import java.time.Period;

public class Test {
    public static void main(String[] args) {
        Period period = Period.of(2, 1, 0)   // P2Y1M
                        .ofYears(10)                     // P10Y
                        .ofMonths(5)                    // P5M
                        .ofDays(2);                       // P2D
        System.out.println(period);                            // Prints P2D, The of() method always creates a new Period object, discarding the previous values 
    }
}
