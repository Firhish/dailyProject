package quizzes.quiz3.q31;

// cannot instantiate abstract class
abstract class Log {
    abstract long count();

    abstract Object get();
}

class CommunicationLog extends Log {
    // Doesnt implement the body of the abstract class properly since the data type is different
    // int count(){}
    long count() {
        return 100;
    }

    String get() {
        return "COM-LOG";
    }
}

public class Test {
    public static void main(String[] args) {
        Log log = new CommunicationLog();
        // .count and .get can be called since it is overidden by CommunicationLog
        System.out.println(log.count());
        System.out.println(log.get());
    }

}
