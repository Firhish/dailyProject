package refresher.Inheritance;

public class Arnab extends Haiwan{

    void bergerak(){
        System.err.println("melompat");
    }

    @Override
    void mencakar() {
        System.out.println("cakar daun");
    }
}
