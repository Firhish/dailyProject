package quizzes.quiz3.q16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("an");
        words.add("the");
        words.add("when");
        words.add("what");
        words.add("where");
        words.add("whether");

        processStringArray(words,(String p) -> p.length() < 100);

        // Correct to print all
        // p -> !!!!true
        // p -> p.length() >= 1
        // p -> true
        // (String p) -> p.length() < 100

        // Incorrect
        // p -> p.length() < 7         // cant print "whether" since whether is exactly 7 in length
        // String p -> p.length() > 0  // Round brackets or parenthesis are missing around 'String p'
        // p -> !!false                // false
    }

    private static void processStringArray(List<String> list, Predicate<String> predicate) {
        for(String str : list){
            if(predicate.test(str)){
                System.out.println(str);
            }
        }

    }

}
