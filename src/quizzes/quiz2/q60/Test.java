package quizzes.quiz2.q60;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        // LocalDate.parse(CharSequence) method accepts String in "9999-99-99" format only.
        // To represent 9th June 2018, format String must be "2018-06-09".
        LocalDate date = LocalDate.parse("2018-1-01");
        System.out.println(date);
    }
    
}
