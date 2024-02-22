package quizzes.quiz3.q36;

public interface Flyable {
    // method can have body since it is static
    static int horizontalDegree(){
        return 20;
    }

    // default method also can have a body
    default void fly(){
        System.out.println("Flying at " + horizontalDegree() + " degrees.");
    }

    // abstract method cant have body
    void land();
}


