package enthuware;


public class FinalVariable {

    final static int i1; // final obj/class variable need to initialize
    final int i2;

    static{i1 = 'a';}

    FinalVariable(int num){
        this.i2 = num;
    }

    public static void main(String[] args) {
        final int a;
    }
    
}

