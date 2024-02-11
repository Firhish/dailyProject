package quizzes.quiz2.q25;

class Message{
    public static void main(String[] args) {
        System.out.println("Welcome " + args[0] + "!");
    }
}

// String array passed in the terminal will be the arguments of Guest main method
public class Guest {
    public static void main(String[] args) {
        // The "args" array passed will be then passed to Message main method
        Message.main(args); // called statically
    }
        
}
