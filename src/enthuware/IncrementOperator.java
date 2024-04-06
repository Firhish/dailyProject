package enthuware;

public class IncrementOperator {

    public static int m1(int i) {
        return ++i;
    }

    public static void main(String[] args) {
        int k = m1(args.length);
        k += 3 + ++k;
        System.out.println(k);

        //diff q
        // int a = 5,  b = 2, c = 30; 
        // System.out.println( (a + b)-- * c  );   // increment/decrement operators can only be applied to a variable. (a+b) is not a variable. It is an expression.
 
    }

}
