package quizzes.quiz1.q18;

public class Test {
    public static void main(String[] args) {
        boolean flag = false;
         // bitwise inclusive OR | has higher precedence over logical OR ||. flag = false
         // (true | (flag = false)) || (flag = true)
         // (true | false) || (flag = true)
         // true || (flag = true)
         // true
         System.out.println((flag = true) | (flag = false) || (flag = true));
        // prints false on to the console as flag variable is false
         System.out.println(flag);
    }
    
}
