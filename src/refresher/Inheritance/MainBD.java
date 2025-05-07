package refresher.Inheritance;

class Base{
    int id = 1000;

    Base(){
        // super();
        // invokes the Base() method and not the constructor.
        // invokes the overridden method in Derived class
        Base();
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
        // super();
        Base();
    }

    // Subclass overrides the methods of superclass but it hides the variables of superclass
    void Base() {
        System.out.println(--id);
    }
}

public class MainBD {

    public static void main(String[] args) {
        new Derived();
    }
    
}
