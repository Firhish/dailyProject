package quizzes.quiz3.q22;

public interface GetSetGo{
    // This is a final and static variable
    int count = 1;

    // only static and default method can have body in interface
    static void staticMethod(){
        System.out.println("static method");
    }

    // Non static method's body need to implemented by classes that implement the interface
    void abstractMethod();

    // default only for method
    // can be overrides by classes that implement the interface
    default String defaultMethod(){
        return "from interface";
    }

}