package lessons.lesson7.generic.genericMaximizer;

import java.util.Comparator;

public class Maximizer<T> {
    private T[] array;

    public Maximizer(T[] array){
        this.array = array;
    }

    public T findMax(Comparator<T> comparator){
        T currMax = array[0];

        for(int i = 0; i < array.length; i++){
            // cannot use the > operator directly for objects or generic types
            // comparator more suitable for generic types
            if(comparator.compare(array[i], currMax) > 0){
                currMax = array[i];
            }
        }
        return currMax;
    }
    
}
