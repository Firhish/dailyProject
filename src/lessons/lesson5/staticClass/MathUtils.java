package lessons.lesson5.staticClass;

// Static classes in Java are similar to static classes in C#, they cannot be instantiated,
// and they can only contain static members. They are appropriate for utility classes that
// contain methods applicable to a specific domain but don't require instance-specific data.
// Static classes are also useful when you want to group related methods together without the
// need for creating instances of the class.

public class MathUtils {

    public static void main(String[] args) {

        System.out.printf("Add result: %d\n", add(10, 5));
        System.out.printf("Subtract result: %d\n", subtract(15, 8));
        System.out.printf("Is 17 even or odd: %b\n", isEven(17));

        // static methods can be called without instantiating any object 
    }

    public static int add(int num1, int num2){

        return num1 + num2;

    } 

    public static int subtract(int num1, int num2){

        return num1 - num2;

    }

    public static boolean isEven(int num){

        return num % 2 == 0? true : false; 

    }

}



