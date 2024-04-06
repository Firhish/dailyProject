package enthuware;

class Parent{
    int allowance = 100;

    void talk(){
        System.out.println("Hello, saya parents");
    }
}

class Child extends Parent{
    int allowance = 20;

    void talk(){
        System.out.println("Hello, saya anak dia");
    }
}

class GrandChild extends Child{
    int allowance = 5;

    void talk(){
        System.out.println("Hello, saya cucu dia");
    }
}


public class BasicInheritance {

    public static void main(String[] args) {

        Parent person =  new GrandChild();

        System.out.println(((Child)person).allowance);
        person.talk();
        
    }
    
}
