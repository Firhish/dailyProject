package quizzes.quiz2.q2;

public class Test {

    public static void main(String[] args) {

        //INSERT
        // char var = 10;
        // Integer var = 10;
        Short var = 10;
        // byte var =10;

        //DONT INSERT
        // double var = 10; // the problem is not when we declare the variable, it comes when the switch want to accept 10 (an int) as a case to var that have double datatypes
        // long var = 10;      // switch case cant accept long variable 

        switch (var) {
            case 10:
                System.out.println("TEN");
                break;
        
            default:
                break;
        }
    }
    
}
