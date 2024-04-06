package enthuware;

public class InstanceVarBehavior {

    int a;
    int b = 0;
    static int c;
    String str1;

    public void m() {
        String str2;         // need to initialize too (local variable)
        int d;              
        int e = 0;
        d = e;               // Initialization can be on seperate lines

        a++;
        b++;
        c++;
        d++;                 // only instance variable and class variable can be automatically assigned to 0
        e++;

    }

    public static void n(){
        // a++;                 // a is not a class variable, it is an instance variable, so static method cannot access it 
    }

}
