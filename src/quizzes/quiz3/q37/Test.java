package quizzes.quiz3.q37;

// Instance variable that have the same name in class hierarchy is exlusive for that class

class Parent{
    String quote = "MONEY DOESNT GROW ON TREES";
    String quote2 = "jsdba";
}

class Child extends Parent{
    String quote = "LIVE LIFE KING SIZE";
}

class GrandChild extends Child{
    String quote = "PLAY PLAY PLAY";
}

public class Test {

    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        
        // CORRECT
        System.out.println(((Parent)(Child)gc).quote);
        System.out.println(((Parent)gc).quote);

        // INCORRECT
        // System.out.println(gc.quote);                 // Print play play play
        // System.out.println((Parent)gc.quote);         // cant cast String to Parent type
        // System.out.println((Parent)(Child)gc.quote);  // cant cast String to Child type

    }    
}
