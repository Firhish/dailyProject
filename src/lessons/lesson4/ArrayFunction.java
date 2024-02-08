package lessons.lesson4;

public class ArrayFunction {
    public static void main(String[] args) {
        int[] a = { 100, 101, 102, 103 };
        int k = 100;
        printArrayValues(a);                     // a = 100, 101, 102, 103  (Outside function)
        System.out.println("k = " + k);          // k = 100  (Outside function)
        someMethod(k, a);                        // a = 0,0,0,0 and k = 0 (new values assigned in the function)
        printArrayValues(a);                     // a = 0,0,0,0 (a values changed since arrays are objects, so their reference is passed instead of their values)
        System.out.println("k = " + k);          // k = 100, ( k values remains the same since java passes primitive types by value not reference)
    }

    public static void someMethod(int k, int[] b) {
        System.out.println("-------------In the method.");
        k = 0;
        for (int i = 0; i < b.length; i++)
            b[i] = 0;
        printArrayValues(b);
        System.out.println("k = " + k);
        System.out.println("---Going out of the method.");
    }

    public static void printArrayValues(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + ",");
        System.out.println();
    }
}
