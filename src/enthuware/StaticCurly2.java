package enthuware;


class Hello{
    static int num;

    static{
        num = 20;
    }

    Hello(int passed){
        num = passed;
    }
}

public class StaticCurly2 {

    public static void main(String[] args) {

        System.out.println(Hello.num);
        Hello obj = new Hello(123);
        System.out.println(Hello.num);
        
    }
    
}


