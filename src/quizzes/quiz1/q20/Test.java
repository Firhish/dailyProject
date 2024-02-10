package quizzes.quiz1.q20;

public class Test {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = 7;
        int d = 9;
        boolean res = --a + --b < 1 && c++ + d++ > 1;  // will update only a and b, since the first part of the AND statement is false hence the second part is skipped 
        // boolean res = c++ + d++ > 1 && --a + --b < 1 ; // will update all var, since the first part of the AND statement is true hence the second part is executed
        System.out.printf("a = %d, b = %d, c = %d, d = %d, res = %b\n",a,b,c,d,res);       
    }
    
}
