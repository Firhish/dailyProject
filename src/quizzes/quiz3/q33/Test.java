package quizzes.quiz3.q33;

public class Test {
    // Any RuntimeException can be thrown without any need it to be declared in throws clause of surrounding method.
    private static void div(int i, int j){
        try{
            System.out.println(i/j);
        } catch(ArithmeticException e){
            // cast into runtime which is more general
            throw (RuntimeException)e;
        }
    }

    public static void main(String[] args) {
        try {
            div(5, 0); 
        } 
        // catch more specific exception
        catch (ArithmeticException e) {
            System.out.println("AE");
        } 
        catch(RuntimeException e){
            System.out.println("RE");
        }
    }
    
}
