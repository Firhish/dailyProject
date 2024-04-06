package enthuware;

import java.util.ArrayList;
import java.util.List;

public class ArrayAndList {

    public static void main(String[] args) {

        int[] arr = new int[3];
        List<String> list = new ArrayList<String>();

        // list.add("hello1");
        // list.add("hello2");
        // list.add(2,"hello3");                  // maximum index is always < (curent list size + 1(the one we want to add)) which is in this case is 2

        // Print out test
        // System.out.println(arr);               // print location
        // System.out.println(list);              // print data in this format "[data1, data2, data3]"

        // foreach loop test 
        // for (int elm : arr) {
        //     System.out.println(elm);           // initialize and print element according to pre determined size(3)
        // }

        // for (String str: list) {
        //     System.out.println(str);           // not initialize or print any value since the size is dynamic, the current size is 0 (nothing to initialize)
        // }

        // for loop test
        // for(int i = 0; i < arr.length;i++){
        //     System.out.println(arr[i]);        // initialize and print element according to pre determined size(3)
        // }

        // for(int i = 0; i < list.size();i++){
        //     System.out.println(list.get(i));   // not initialize or print any value since the size is dynamic, the current size is 0 (nothing to initialize)
        // }




    }

}
