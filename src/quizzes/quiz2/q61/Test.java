package quizzes.quiz2.q61;

public class Test {

    private static boolean flag = !true;
    public static void main(String[] args) {
        // flag is true hence the first element will be printed
        System.out.println(!flag ? args[0] : args[1]);        
    }
    
}
