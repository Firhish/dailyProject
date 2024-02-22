package quizzes.quiz3.q27;

class Base{
    int id = 1000;

    Base(){
        super();
        // invokes the Base() method and not the constructor.
        // invokes the overridden method in Derived class
        // Base();
    }

    void Base(){
        System.out.println(++id);
    }

}

class Derived  extends Base{
    // hides the variable created at super class
    int id = 2000;

    // Compiler adds super(); as the 1st statement inside the no-argument constructor of Base class and Derived class.
    Derived(){
        super();
    }

    // Subclass overrides the methods of superclass but it hides the variables of superclass
    void Base() {
        System.out.println(--id);
    }
}

class SibsToDerived  extends Base{
    // hides the variable created at super class
    int id = 2000;

    // Compiler adds super(); as the 1st statement inside the no-argument constructor of Base class and Derived class.
    SibsToDerived(){}

    // Subclass overrides the methods of superclass but it hides the variables of superclass
    void Base() {
        System.out.println(--id);
    }
}

class SecDerived  extends Derived{
    // hides the variable created at super class
    int id = 3000;

    // Compiler adds super(); as the 1st statement inside the no-argument constructor of Base class and Derived class.
    SecDerived(){}

    // Subclass overrides the methods of superclass but it hides the variables of superclass
    void Base() {
        System.out.println(id);
    }
}





public class Test {
    public static void main(String[] args) {

        SecDerived secDerived = new SecDerived();
        SibsToDerived sibsToDerived = new SibsToDerived();


        System.out.println((((Base)secDerived).id));   // 1000
        System.out.println(((Derived)secDerived).id);  // 2000
        System.out.println(secDerived.id);             // 3000

        ((Base)secDerived).Base();                     // 3000
        ((Derived)secDerived).Base();                  // 3000
        secDerived.Base();                             // 3000

        System.out.println(sibsToDerived.id);          // 2000
        System.out.println(((Base)sibsToDerived).id);  // 1000

        sibsToDerived.Base();                          // 1999
        ((Base)sibsToDerived).Base();                  // 1998
    }
}

/*
Constructor execution flow

1. default no-argument super(), a class always have a base class which is java.lang.Object
2. instance variable assignment statement (if available) are executed
3. The rest of statements in a constructor
*/
