package quizzes.quiz2.q49;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        for(int i : arr){                   // i here is not an index, it refers to the element in the array
            System.out.println(arr[i]);     // throw ArrayIndexOutOfBoundsException since index is (0-2) while the array contains 3 which is beyond the index limit
        }
    }
    
}
