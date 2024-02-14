package quizzes.quiz2.q56;

public class Test {
    public static void main(String[] args) {
        int x = 5;
        while(x < 10)
            System.out.println(x);  // since the while loop dont have {} only this line will be include in the loop
            x++;                    // the iteration is not included in the loop, hence the while loop will looping infinitely
    }
    
}
