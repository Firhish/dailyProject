package quizzes.quiz3.q18;

public class Test {
    public static void main(String[] args) {
        int num = 10;
        if(num++ == num++){                         // false since preincrement operator, 10 == 11 (false)
            System.out.println("EQUAL " + num);
        } else{
            System.out.println("NOT EQUAL " + num); // num is 12 here
        }
    }
}
