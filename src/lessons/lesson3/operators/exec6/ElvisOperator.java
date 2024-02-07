package lessons.lesson3.operators.exec6;

public class ElvisOperator {

    public static void main(String[] args) {
        int intA = 12;
        int intB = 5;

        int highest = (intA > intB) ? ((intA < 15) ? 20 : 30): intB;

        System.out.println(highest);
    }
    
}
