package quizzes.quiz2.q51;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0,"Aray");     // .add(int index, elementType elm) will add an elm to the array at specified index
        list.add(0, "List");    // will move "Array" to the right an replaced by "List" in index 0

        System.out.println(list);             // print [List,Array]
    }
}
