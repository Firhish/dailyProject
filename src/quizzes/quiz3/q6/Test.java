package quizzes.quiz3.q6;

public class Test {
    public static void main(String[] args) {
        // bitwise inclusive OR (|) has a higher precedence than the logical OR (||) and assignment operators (=).
        // prioritize | first
        boolean status = false;

        //                 Assignments       Assignments      Assignments  
        // System.out.println(status = false || status = true |  status = false );

        //                 Assignments       Return Bool      Return Bool  
        System.out.println(status = false || status == true | status == false );

    }
    
}
