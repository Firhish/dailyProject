package enthuware;

import java.util.ArrayList;
import java.util.List;

public class AddToListWIndex {
    
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // index must <= current size

        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add(5,"hello");
        
    }
    
}
