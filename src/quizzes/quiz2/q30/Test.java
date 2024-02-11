package quizzes.quiz2.q30;

public class Test {
    public static void main(String[] args) {
        char c = 'Z';         // ASCII value of 90
        long l = 100_00l;
        int i = 9_2;
        float f = 2.02f;
        double d = 10_0.35d;

        l = c + i;            // 90 + 92, so this is valid
        f = c * l * i * f;
        f = l + i + c;
        i = (int)d;
        f = (long)d;
    }
}
