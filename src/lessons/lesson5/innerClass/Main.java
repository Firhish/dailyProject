package lessons.lesson5.innerClass;

// An inner class in Java is a class declared within another class. It has access to all members of the outer class,
// including private members, and can be instantiated only within the scope of the outer class. Inner classes are
// appropriate when you need to logically group classes together and encapsulate functionality that is closely related
// to the outer class. They are commonly used for event handling, listeners, and implementing data structures.

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner("Inner name");
        System.out.println("Inner name: " + inner.getName());
    }
}

