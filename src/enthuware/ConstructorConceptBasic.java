package enthuware;


class Parent2{

    Parent2(){
        super();
        // initialize instance variable (if any)
        System.out.println("Parent");
    }

}

class Child2 extends Parent2{

    int num = 1000;
    static String str = "hell0";

    Child2(){
        super();
        // initialize instance variable (if any)
        // other statements
        System.out.println("Child");
    }

}

public class ConstructorConceptBasic {

    public static void main(String[] args) {
        
        Child2 c1 = new Child2();
        Child2 c2 = new Child2();

        System.out.println(c1.str.equals(c2.str));
    }
    
}
