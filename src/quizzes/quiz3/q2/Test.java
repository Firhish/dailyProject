package quizzes.quiz3.q2;

class Base{
    // Variable in parent class will not be overrides by the variable with the same name in the subclass
    String msg = "BASE";
}

class Derived extends Base{
    String msg = "DERIVED";
}

public class Test {

    public static void main(String[] args) {
        Base obj1 = new Base();
        Base obj2 = new Derived();              
        Derived obj3 = (Derived) obj2;
        String text = obj1.msg + "-" + obj2.msg + "-" + obj3.msg;
        System.out.println(text);
    }
    
}
