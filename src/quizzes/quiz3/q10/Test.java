package quizzes.quiz3.q10;

public class Test {
    int i1 = 10;
    static int i2 = 20;

    private void change1(int val){
        i1 = ++val;
        i2 = val++;
    }

    private static void change2(int val){
        // i1 = --val;                          // Compilation error, i1 is not a static field (belong to object not class) 
        i2 = val--;
    }

    public static void main(String[] args) {
        // change1(5);                          // Compilation error, need to initialize Test obj to access .change1() method since it is not a static method
        change2(5);
        // System.out.println(i1 + i2);         // Compilation error, i1 is not a static field (belong to object not class) 
        
    }
}
