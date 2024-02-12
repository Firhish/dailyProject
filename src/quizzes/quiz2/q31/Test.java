package quizzes.quiz2.q31;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<StringBuilder> days = new ArrayList<>();
        days.add(new StringBuilder("Sunday"));
        days.add(new StringBuilder("Monday"));
        days.add(new StringBuilder("Tuesday"));

        // StringBuilder does not override the equals(Object) method
        // contains method relies on the default equals implementation from the Object class, which checks for reference equality
        // new StringBuilder("Sunday") to check for containment,creates a new StringBuilder object
        // since the reference of this new object is not the same as the one already in the list, contains returns false.
        if(days.contains(new StringBuilder("Sunday"))){ 
            days.add(new StringBuilder("Wednesday"));
        }
        
        //  the final size of the days list remains 3
        System.out.println(days.size());
    }
    
}
