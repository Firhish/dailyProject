package enthuware;

public class LocalVarOverride {

    static String args[] = {"itu", "static", "variable"};
    static int val = 1;

    public static void main(String[] args) {
        int val = 20; // the local variable (val) shadows the class-level variable (val) within the scope of the method

        System.out.println(LocalVarOverride.args[0] + " " + args[1] + " " + args[2]);    
        System.out.println(val);    

    }
    
}
