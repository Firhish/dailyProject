package quizzes.quiz3.q4;

public class Test {
    public static void main(String[] args) {
        // string builder alter the same object during .append
        // string object create another String object during .concat
        StringBuilder sb = new StringBuilder("B");
        sb.append(sb.append("A"));
        System.out.println(sb);
    }
    
}
