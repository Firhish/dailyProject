package quizzes.quiz2.q39;

public class Test {
    public static void main(String[] args) {
        String s1 = "OcA";
        String s2 = "oCa";

        // print false since comparing string with .equals() is case sensitive
        System.out.println(s1.equals(s2));
        // print true since it ignores differences in case type
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
