package quizzes.quiz3.q23;

public class Test {
    public static void main(String[] args) {
        // public Throwable() {...} : No-argument constructor
        System.out.println(new RuntimeException());      
        // public Throwable(String message) {...} : Pass the detail message                                
        System.out.println(new RuntimeException("Hello"));
        // public Throwable(Throwable cause) {...} : Pass the cause
        System.out.println(new RuntimeException(new RuntimeException("Hello")));
        // public Throwable(String message, Throwable cause) {...} : Pass the detail message and the cause
        System.out.println(new RuntimeException("Message",new RuntimeException()));
    }
    
}
