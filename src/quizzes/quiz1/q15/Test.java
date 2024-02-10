package quizzes.quiz1.q15;

public class Test {

    public static void main(String[] args) {
        int i = 0;
        // first sout print 0, since it is PostIncrementExpression (line 10 in init part)
        // second sout print 1, since i = 1 after incremented (line 11)
        // third sout print 1, since it is PostIncrementExpression (line 10 in update part)
        for(System.out.print(i++);i < 2; System.out.println(i++)){
            System.out.print(i);
        }
    }
    
}
