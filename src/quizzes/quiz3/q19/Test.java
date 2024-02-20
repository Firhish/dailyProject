package quizzes.quiz3.q19;

interface M{
    // the scope of static log() method of M is limited to interface M and it can be invoked by using Interface name only, M.log().
    public static void log(){
        System.out.println("M");
    }
}

abstract class A{
    public static void log(){
        System.out.println("N");
    }
}

class MyClass extends A implements M{}

public class Test {
    public static void main(String[] args) {
        M obj1 = new MyClass();
        // obj1 is of M type, hence `obj1.log();` tries to tag the static method of M but static log() method of M can only be invoked by using M.log();
        // obj1.log();

        A obj2 = new MyClass();
        obj2.log();

        MyClass obj3 = new MyClass();
        obj3.log();
    }
    
}
