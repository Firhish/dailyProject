package quizzes.quiz2.q63;

public class Test {
    public static void main(String[] args) {
        int score = 60;

        // case values must evaluate to the same type / compatible type as the switch expression can use.
        switch (score) {
            default:
                System.out.println("Not a valid score");
            // score < 70 return boolean but score is int
            // case score < 70:
            //     System.out.println("Failed");
            // score >= 70 return boolean but score is int
            // case score >= 70:
            //     System.out.println("Passed");
            //     break;
        }
    }
    
}
