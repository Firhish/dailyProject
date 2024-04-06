package enthuware;

class Base{
    int id = 1000;
    
    Base(){
        // super();
        // initialize
        // Other statements
        Base();
    }

    void Base(){
        System.out.println(++id);
    }
}

class Derived extends Base{
    int id = 2000;

    Derived(){
        // super();
        // initialize
        // other statements
        System.out.println(id);
    }

    void Base(){
        System.out.println(--id);
    }

}

public class ConstructorConceptQ {
    public static void main(String[] args) {
        Base base = new Derived();
    }

}

