package enthuware;

public class DataTypeSum {

    public static void main(String[] args) {

        // Conclusion
        // String > floating-point > integral
        // boolean dont have + operator only (&& || !)

        // int + int = int
        System.out.println(5/3);

        // int + double = double
        System.out.println(1 + 1.0);

        // int + float = float
        System.out.println(1 + 1f);
        
        // int + string = int + string
        System.out.println(1 + 1 + "2");

        // string + int + int = string
        System.out.println("2" + 1 + 1 );

        //  double + string = double + string
        System.out.println(1.0 + 1.0 + "2");

        // string + double + double = string
        System.out.println("2" + 1.0 + 1.0 );
        
        // char + char = char(integral)
        System.out.println('a'+'a');

        // char + string = char(integral) + string
        System.out.println('a'+'a'+"str");

        // string + char + char = string
        System.out.println("str"+'a'+'a');

        // boolean + int = invalid (no + operator for boolean)
        // System.out.println(true + 1);
    }
    
}
