package quizzes.quiz2.q37;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        String[] arr = { "*", "**", "***", "****", "*****" };
        // When you use a raw type for the Predicate, the type of the lambda parameter is inferred as Object, and Object does not have a length() method.
        // it's good practice to use the generic type explicitly
        // Predicate pr1 = s -> s.length() < 4;
        // print(arr, pr1);
    }

    private static void print(String[] arr, Predicate<String> predicate) {
        for (String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }

}
