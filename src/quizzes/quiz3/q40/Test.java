package quizzes.quiz3.q40;

public class Test {
    public static void main(String[] args) {
        String str = "Game on";
        StringBuilder sb = new StringBuilder(str);

        System.out.println(str.contentEquals(sb));
        // .contentEquals is a method from String object
        // StringBuilder object cannot accessed the method
        // System.out.println(sb.contentEquals(str));

        // meanwhile .equals is a method from Object class 
        // so StringBuilder and String object can access it

        // `sb.equals(str)` => It also compiles fine, StringBuilder class doesn't override equals(Object) method. So Object version is invoked which uses == operator, hence `sb.equals(str)` would return false as well at runtime.
        System.out.println(sb.equals(str));

        // str.equals(sb)` => It compiles fine, String class overrides equals(Object) method but as 'sb' is of StringBuilder type so `str.equals(sb)` would return false at runtime.
        System.out.println(str.equals(sb));
    }
    
}
