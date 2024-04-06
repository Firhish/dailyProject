package enthuware;

public class Ascii {

    public static void main(String[] args) {

        // conclusion
        // \u0061 is a character literal representing the Unicode character 'a'.
        // 97 or 0x61 are integer literals representing the ASCII value of 'a', but they are not character literals.

        char c1 = '\u0061'; // Unicode(start with \ and u) character literal
        char c2 = 97; // Integer literal representing ASCII value
        char c3 = 0x61; // Hexadecimal integer literal representing ASCII value

        System.out.println(c1); // This will print 'a'
        System.out.println(c2); // This will also print 'a'
        System.out.println(c3); // This will also print 'a'

    }

}
