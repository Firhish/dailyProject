package enthuware;

import java.util.ArrayList;
import java.util.List;

class Example3 {

    int vallue = 2;

    public int getVallue() {
        return vallue;
    }
}

public class ArrayAndList2 {

    public static void main(String[] args) {

        // concept to focus: 1. static vs dynamic storage 2. toString() properties 3. Exception handling capabilities

        Example3[] arr = new Example3[3];
        // arr[0] = new Example3();
        List<Example3> list = new ArrayList<>();
        // list.add(new Example3());

        // System.out.println(arr);    // @location
        // System.out.println(list);   // []

        // for (Example3 example3 : arr) {System.out.println(example3);}   // null null null
        // for (Example3 example3 : list) {System.out.println(example3);}  // nothing printed (since size is 0, iteration cannot be made)

        for (int i = 0; i < arr.length; i++) {System.out.println(arr[i]);}            // null null null
        for (int i = 0; i < list.size(); i++) {System.out.println(list.get(i));}      // nothing printed (since size is 0, iteration cannot be made)

        // ArrayIndexOutOfBoundsException only for array
        // IndexOutOfBoundsException for arraylist

    }

}
