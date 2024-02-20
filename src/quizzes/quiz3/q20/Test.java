package quizzes.quiz3.q20;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list;
        list = new ArrayList<>();
        list.add("A");
        list.add("E");
        list.add("I");
        list.add("O");
        list.add("U");
        // ist.subList(0, 4) --> [A, E, I, O] (toIndex is Exclusive, therefore start index is 0 and end index is 3].
        list.addAll(list.subList(0, 4));
        System.out.println(list);
    }
    
}
