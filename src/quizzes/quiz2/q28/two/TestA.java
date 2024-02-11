package quizzes.quiz2.q28.two;

import quizzes.quiz2.q28.one.A;

public class TestA {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.i1);  // can be accessed since it public
        // System.out.println(obj.i2);  // cant be accessed from different package (but can be accessed by subclass) // protected
        // System.out.println(obj.i3);  // cant be accessed from different package // package-private(default)
        // System.out.println(obj.i4);  // cant be accesse since it is private
    }
    
}
