package quizzes.quiz3.q53;

public class Test {
    public static void main(String[] args) {
        try{
            try {
                // throw arithmetic exception
                System.out.println(1/0);    
            } 
            // catch the thrown exception here
            catch (ArithmeticException e) {
                System.out.println("INNER");
            } 
            // will execute whatever happens
            finally{
                System.out.println("FINALLY 1");
            }
        } 
        // will not catch the exception anymore 
        catch(ArithmeticException e){
            System.out.println("OUTER");
        }
        // will execute whatever happens
        finally{
            System.out.println("FINALLY 2");
        }

        // Print INNER FINALLY 1 FINALLY 2
    }
}
