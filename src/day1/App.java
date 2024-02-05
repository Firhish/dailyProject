package day1;
public class App{
    public static void main(String[] args){
        System.out.printf("%s %s,%s\n","hello world",args[0],args[1]);
        second();
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.second();
        AnotherClass.third();
    }

    public static void second(){
        System.out.println("second");
    }
}

class AnotherClass{
    void second(){
        System.out.println("Second from another class");
    }
    
    static void third(){
        System.out.println("Third");
    }
}