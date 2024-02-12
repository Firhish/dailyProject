package quizzes.quiz2.q44;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        // Two instances of following wrapper objects, created through auto-boxing will always be same
        //  Auto-boxing creates an integer object for 27
        list.add(27);
        // Java compiler finds that there is already an Integer object in the memory with value 27, so it uses the same object
        list.add(27);

        // new Integer(27) creates a new Object in the memory
        list.add(new Integer(27));
        list.add(new Integer(27));

        // elm of 0 and 1 index pointed to same object whose value is 27
        System.out.println(list.get(0) == list.get(1));
        // elm of 2 and 3 index pointed to two different objects
        System.out.println(list.get(2) == list.get(3));
        
    }
}
