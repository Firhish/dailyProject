package quizzes.quiz3.q17;

// Checked exceptions are exceptions that are checked at compile time
// runtime exceptions in Java are not checked at compile time


public class Test {
    private static void test() throws Exception{
        throw new Exception();
    }

    public static void main(String[] args){
        // Handle or Declare rule should be followed for checked exception if you are not re-throwing it.
        // Add catch here or declare in main
        try{
            // test();
        }finally{
            System.out.println("GAME ON");
        }
    }
    
}
