package quizzes.quiz3.q9;

public class Test {
    public static void main(String[] args) {
        // 1. Initialize variable used to iterate
        // 2. Check condition (stop here if false)
        // 3. Run statement (if true)
        // 4. Update iteration variable accordingly
        // 5. Check condition again.....

        for(int x = 10, y = 11, z = 12; y > x && z > y; y++, z -= 2){
            System.out.println(x + y + z);
        }
    }
}
