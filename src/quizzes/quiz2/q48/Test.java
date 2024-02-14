package quizzes.quiz2.q48;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");

        // if(list.remove(2)){             // Compilation error since .remove(int index) return the deleted element's data type instead of boolean
        //     list.remove("THREE");
        // }

        // if(list.remove("THREE")){       // Compile successfully since .remove(Obj obj) return boolean (true when delete successful, false when unsuccessful)
        //     list.remove(2);
        // }

        System.out.println(list);
    }
    
}
