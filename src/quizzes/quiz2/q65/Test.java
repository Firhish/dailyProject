package quizzes.quiz2.q65;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1980-03-16");
        // minusYears, minusMonths, minusWeeks, minusDays methods accept long parameter so you can pass either positive or negative value.
        // minus minus is plus
        // Similarly plusYears, plusMonths, plusWeeks, plusDays methods work in the same manner.
        // If positive value is passed, then that specified value is added and if negative value is passed, then that specified value is subtracted
        System.out.println(date.minusYears(-5));
    }
    
}
