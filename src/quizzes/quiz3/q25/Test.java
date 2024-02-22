package quizzes.quiz3.q25;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int i = 0;
        // value 40 will be assigned into both arr[0] and arr[2]
        // these way a single value can be assigned into more than one variable
        arr[i++] = arr[++i] = 40;
        for(int x : arr){
            System.out.println(x);
        }
    }
}
