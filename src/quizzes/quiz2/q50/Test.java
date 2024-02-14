package quizzes.quiz2.q50;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // ArrayList is designed to store objects, thats why it can store null value
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list.remove(0) + ":" + list.remove(null)); // print "null:true", the first .remove(int index) method return deleted element while the second .remove(Obj obj) return boolean
    }
    
}
