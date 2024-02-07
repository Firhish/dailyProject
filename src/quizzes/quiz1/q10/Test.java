package quizzes.quiz1.q10;

class X{
    void greet(){
        System.out.println("Good Morning");
    }
}

class Y extends X{
    void greet(){
        System.out.println("Good Afternoon");
    }
}

class Z extends Y{
    void greet(){
        System.out.println("Good Night");
    }
}


public class Test {

    public static void main(String[] args) {

        // Parents can instantiate child class but the child cant do the same
        X x = new Z();

        // Eventhough the data type is X but the object will remain as Z
        System.out.println(x.getClass());

        // Invoke greet method from Z class (overrides from X and Y)
        x.greet(); // line n1

        // Invoke greet method from Z types even after casting to Y
        ((Y)x).greet();// line n2

        // Invoke greet method from Z even after casting to Z
        ((Z)x).greet();// line n3
        
        
    }
    
}
