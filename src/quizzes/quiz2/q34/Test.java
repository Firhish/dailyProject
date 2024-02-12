package quizzes.quiz2.q34;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        // LocalDate.parse(CharSequence text) method accepts String in "9999-99-99" format only
        // in which month and day part in the passed object referred by text should be of 2 digits,
        // Single digit month and day value are not automatically padded with 0 to convert it to 2 digits.
        // To represent 9th June 2018, format String must be "2018-06-09".
        dates.add(LocalDate.parse("2018-7-11")); 
        dates.add(LocalDate.parse("1919-10-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

        dates.removeIf(x -> x.getYear() < 2000);

        // Runtime exception
        System.out.println(dates);
    }
    
}
