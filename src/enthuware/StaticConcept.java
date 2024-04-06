package enthuware;

class Node{
    static final int value = 1;
    static void sayHello(){System.out.println("hello");}
}

public class StaticConcept {

    public static void main(String[] args) {
        new Node().sayHello();
    }   
}
