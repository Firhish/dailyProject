package quizzes.quiz2.q28.one;

public class A {
    public int i1;      // can be accessed
    protected int i2;   // cant be accessed from different package (but can be accessed by subclass)
    int i3;             // cant be accessed from different package
    private int i4;     // cant be accesse since it is private
}
