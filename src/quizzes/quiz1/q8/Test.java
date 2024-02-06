package quizzes.quiz1.q8;

public class Test {
    public static void main(String[] args) {
        
        //Insert
        short x = 7, y = 200;
        // int x = 7, y = 200;
        // long x = 7, y = 200;

        //Dont Insert
        // byte x = 7, y = 200;  // too small in memory allocation
        // float x = 7, y = 200;  // will get 5 for output not 3 
        // double x = 7, y = 200;  // will also get 5 for output
        
        System.out.println(String.valueOf(x + y).length());

    }
    
}
