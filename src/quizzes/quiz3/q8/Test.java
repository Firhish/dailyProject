package quizzes.quiz3.q8;

public class Test {
    public static void main(String args){
        int score = 30;
        char grade = 'F';
        // if(50 <= score < 60)            // need to do one by one (score >= 50 && score < 60)
            grade = 'D';
        // else if(50 <= score < 60)
            grade = 'C';
        // else if(50 <= score < 60)
            grade = 'B';
        // else if(score >= 80)
            grade = 'A';
        System.out.println(grade);
    }
    
}
