package enthuware;

public class AutoAndManualCast {

    // To discuss
    // 1. shadows (static variable) 
    // 2. automatic or explicit casting (data type)

    public static void main(String[] args) {

        byte b = 1;        // 8 bits, -128 -> 127
        b = (byte)(b + 1); // manual casting
        b++;               // auto casting
        b+=1;              // auto casting

        char c = 'a';

        System.out.println((char)(c + 1));

    }
    
}
