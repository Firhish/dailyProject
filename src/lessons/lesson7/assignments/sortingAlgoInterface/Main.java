package lessons.lesson7.assignments.sortingAlgoInterface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayToSort = {32432,445,6647567,568,78,78,678,6,679,6979,68,657,45,6456546,54667,567,58,78678,678};

        // Testing Bubble Sort
        testSortingAlgorithm(new BubbleSort(), arrayToSort.clone(), "Bubble Sort");

        // Testing Selection Sort
        testSortingAlgorithm(new SelectionSort(), arrayToSort.clone(), "Selection Sort");

        // Testing Insertion Sort
        testSortingAlgorithm(new InsertionSort(), arrayToSort.clone(), "Insertion Sort");
        
    }

    private static void testSortingAlgorithm(Sortable sortable, int[] array, String algorithmName){

        long startTime = System.currentTimeMillis();
        sortable.sort(array);
        long endTime = System.currentTimeMillis();

        System.out.println(algorithmName + " Result: " + Arrays.toString(array));
        System.out.println(algorithmName + " Execution Time: " + (endTime - startTime) + " milliseconds\n");
    }
}
