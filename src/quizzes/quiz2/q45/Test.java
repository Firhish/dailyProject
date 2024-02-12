package quizzes.quiz2.q45;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        // for certain reasons 127 is max to autbox into the same obj
        list.add(127);
        list.add(100);
        list.add(127);
        // only remove the first occurence of obj with value of 100
        list.remove(new Integer(100));

        System.out.println(list);
        // System.out.println(list.get(0) == list.get(2));
        // System.out.println(list.get(1) == list.get(3));
    }
    
}
