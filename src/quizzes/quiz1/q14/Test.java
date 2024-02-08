package quizzes.quiz1.q14;

public class Test {

    public static void main(String[] args) {

        // final int m = 25000; final int n = 25000; short s6 = m + n;  // out of range for short
        final int i5 = 10; short s5 = i5 + 100;
        // final int i4 = 40000; short s4 = i4; // out of range for short
        short s1 = 10;
        final int i3 = 10; short s3 = i3;
        // short s2 = 32768;  // out of range for short
        // int i7 = 10; short s7=i7;  // potential data loss since i7 is not final
        
    }
}
