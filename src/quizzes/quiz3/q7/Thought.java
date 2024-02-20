package quizzes.quiz3.q7;

public class Thought {


    // CORRECT
    // public static void main(String... args) {}  // String... == String[]
    // static public void main(String[] args) {}   // static or public comes first doesnt matter
    // public static void main(String[] args) {}   // OG

    // INCORRECT

    // public void static main(String [] args){}
    // 'void' must come just before the method name 'main'.
    
    // protected static void main(String [] args){}
    // Compiles successfully but as this method is not public, hence an Error regarding missing main method is thrown on execution.

    // public void main(String... args){}
    // Compiles successfully but as this method is not static, hence an Error regarding non-static main method is thrown on execution.

    // static public void Main(String [] args){}
    // 'M' is capital in method 'Main', hence it is not special main method.

    // public static Void main(String [] args){}
    // 'v' in lower-case


}
