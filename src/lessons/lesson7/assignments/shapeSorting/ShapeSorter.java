package lessons.lesson7.assignments.shapeSorting;

import java.util.ArrayList;
import java.util.Collections;

public class ShapeSorter {
    static void sort(SortableShape[] shapes){
        ArrayList<Double> areaList =  new ArrayList<>();

        for(SortableShape shape: shapes){
            areaList.add(shape.area());
        }
        
        Collections.sort(areaList);
        System.out.println(areaList.toString());
    }
}
