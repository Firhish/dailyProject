package refresher.Static;

public class Static {


    static void printSomething(){
        System.out.println("something");
        A Obj1 = new A();
        Obj1.printNum();
    }

    public static void main(String[] args) {
        Static.printSomething();
    }

}

class A{

    int intObj = 10;
    static int intClass = 20;

    void printNum(){
        System.out.println(intObj);
    }

    static void test(){
        new A().printNum();
    }

}
