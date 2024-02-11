package quizzes.quiz2.q22;

public class Test {
    public static void main(String[] args) {
        final String fName = "James";
        String lName = "Gosling";

        // fName + lName is not a constant expression, so it is computed at runtime, resulting in a new String object that is not added to the String pool.
        String name1 = fName + lName;
        // fName + "Gosling" is a constant expression, so it is computed at compile-time, and during compilation, it is translated to "JamesGosling". 
        // This constant expression is added to the String pool.
        String name2 = fName + "Gosling";
        // "James" + "Gosling" is also a constant expression, and it is translated to "JamesGosling" during compilation,
        // which is a String literal added to the String pool.
        String name3 = "James" + "Gosling";

        // name1 refers to a new String object created at runtime.
        // name2 refers to the String literal "JamesGosling" in the String pool.
        // name3 refers to the same String literal "JamesGosling" in the String pool.

        // name1 == name2 evaluates to false because they refer to different objects
        System.out.println(name1 == name2);
        // name2 == name3 evaluates to true because they refer to the same String literal in the String pool.
        System.out.println(name2 == name3);
    }
    
}
