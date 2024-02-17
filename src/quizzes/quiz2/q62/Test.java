package quizzes.quiz2.q62;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hurrah I Passed...");
        // delete characters from substring start on index 'start' until 'end - 1'
        sb.delete(0, 100);
        System.out.println(sb.length());
    }
    
}
