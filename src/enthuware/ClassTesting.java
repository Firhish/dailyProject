package enthuware;

class Example{
    int m = 4;
}

public class ClassTesting {

    public static void change(Example i){
        i = new Example();
        i.m = 20;
    }

    public static void main(String[] args) {

        Example ex = new Example();

        change(ex);

        System.out.println(ex.m);
        
    }
    
}
