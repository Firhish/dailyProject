package enthuware;

public class DataTypeConcept {

    // Concept
    // 1. Hierarchy (data type in java)
    // 2. Size by bits
    // 3. special behavior (char,float,long), widening narrowing
    // 4. superiority (string > floating > integral)

    public static void main(String[] args) {

        byte b = 1;
        b = (byte)(b + 1);        // need explicit casting
        b += 1;                   // automatically casted
        b++;                      // automatically casted

        char c = 'a';             // need explicit casting
        c += 1;                   // automatically casted
        c = (char)(c + (char)1);  // automatically casted

        System.out.println(b);
        System.out.println(++c);

    }

}
