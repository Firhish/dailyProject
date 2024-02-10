package quizzes.quiz1.q19;

public class Test {
    public static void main(String[] args) {
        int val = 25;
        // val is still 25, since this is post increment operator, hence val++ < 26 is true
        if(val++ < 26){
            // print 26 since the val already incremented once
            // it is not 27 since it is also post increment operator
            System.out.println(val++);
        } 
    }
}
