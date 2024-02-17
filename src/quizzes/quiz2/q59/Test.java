package quizzes.quiz2.q59;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        // programmers get confused with M & m and D & d.
        // M represents month & m represents minute
        // D represents day of the year & d represents day of the month.

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm-dd-yy");
        System.out.println(formatter.format(date.minus(period)));
    }

}