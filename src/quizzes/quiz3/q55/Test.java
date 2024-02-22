package quizzes.quiz3.q55;

class Super{
    Super(){
        System.out.println("Reach");
    }
}

class Sub extends Super{
    Sub(){
        // here's the catch
        // Super() is not correct to call a no argument super class constructor
        // use super() instead
        // Super();
        System.out.println("Out");
    }
}

public class Test {
    public static void main(String[] args) {
        new Sub();
    }
    
}
