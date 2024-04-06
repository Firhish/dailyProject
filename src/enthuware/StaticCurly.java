package enthuware;

public class StaticCurly {
    static String s = "";

    static{
        s = "";
    }

    StaticCurly(){
        // super();
        // initializer
        System.out.println(s.concat("bigger"));
    }

    {
        System.out.println("shinier");
    }
 
    static{
        System.out.println(s.concat("better"));
    }

    

    public static void main(String[] args) {
        new StaticCurly();
        System.out.println("Boot");
    }
}
