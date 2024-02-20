package quizzes.quiz3.q5;

class X{
    void A(){
        System.out.println("A");
    }
}

// Class Y correctly extends class X and it overrides method A() and provides two new methods B() and C().
class Y extends X{
    void A(){
        System.out.println("A-");
    }
    void B(){
        System.out.println("B-");
    }
    void C(){
        System.out.println("C-");
    }
}


public class Test {
    public static void main(String[] args) {
        // Y(DERIVED) obj can be instantiate into X(BASE) variable data types
        // Derived can be Base but Base cannot be Derived
        // Child is an EXTENSION and DERIVED 
        X obj = new Y();
        // Invoke overrides .A() method from class Y 
        obj.A();

        // obj cannot access method B and C since there are non of these methods in the X class 
        // obj.B();
        // obj.C();
    }
}
