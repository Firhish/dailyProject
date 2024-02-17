package quizzes.quiz2.q67;

public class Test {
    public static void main(String[] args) {
        int a = 2;
        boolean res = false;
        // is a short-circuit operator, hence no need to evaluate expression on the right.
        // res is true and a is 3.
        res = a++ == 2 || --a == 2 && --a == 2;
        System.out.println(a);
    }    
}