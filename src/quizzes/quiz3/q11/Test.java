package quizzes.quiz3.q11;

interface Perishable1{
    default int maxDays(){
        return 1;
    }
}

interface Perishable2 extends Perishable1{
    // overrides the default method maxDays()
    default int maxDays(){
        return 2;
    }
}

// redundant for Milk class to implement Preishable1 as Perishable2 already extends Perishable1.
// no conflict in Milk class as it inherits the default method maxDays() of Perishable2 interface
class Milk implements Perishable1, Perishable2{}

public class Test {
    public static void main(String[] args) {
        Perishable1 obj = new Milk();
        System.out.println(obj.maxDays());
    }
    
}
