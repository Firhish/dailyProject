package enthuware;

public class DataTypeDeclaration {

    public static void main(String[] args) {
        
        // INTEGRAL 

        long l1 = 1;                 // int
        long l2 = 1l;                // long
        // long l3 = 1.0;            // double (requires an explicit cast when assigning a floating-point value to an integral type)
        // long l4 = 1.0f;           // float ( requires an explicit cast when assigning a floating-point value to an integral type)
        long l5 = 'a';               // char (its still an integral)

        int i1 = 1;                  // int
        // int i2 = 1l;              // long (out of range)
        // int i3 = 1.0;             // double (requires an explicit cast when assigning a floating-point value to an integral type)
        // int i4 = 1.0f;            // float (requires an explicit cast when assigning a floating-point value to an integral type)
        int i5 = 'a';                // char (its still an integral)

        short s1 = 1;                // int (implicit narrowing conversions)
        // short s2 = 1l;            // long (out of range)
        // short s3 = 1.0;           // double (requires an explicit cast when assigning a floating-point value to an integral type)
        // short s4 = 1.0f;          // float (requires an explicit cast when assigning a floating-point value to an integral type)
        short s5 = 'a';              // char (its still an integral)

        char c1 = 1;                 // int (implicit narrowing conversions)
        // char c2 = 1l;             // long (out of range)
        // char c3 = 1.0;            // double (requires an explicit cast when assigning a floating-point value to an integral type)
        // char c4 = 1.0f;           // float (requires an explicit cast when assigning a floating-point value to an integral type)           
        char c5 = 'a';               // char
        

        // FLOATING POINT

        double d1 = 1;               // int 
        double d2 = 1l;              // long
        double d3 = 1.0;             // double
        double d4 = 1.0f;            // float (under double range)
        double d5 = 'a';             // char (its still an integral)

        float f1 = 1;                // int
        float f2 = 1l;               // long (Java allows implicit widening conversions from long to float)
        // float f3 = 1.0;           // double (out of range)  
        float f4 = 1.0f;             // float
        float f5 = 'a';              // char (its still an integral)

    }
    
}
