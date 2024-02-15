package lessons.lesson7.generic.genericStack;

public class Main {

    public static void main(String[] args) {
        // Test with Integer
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        while (!intStack.isEmpty()) {
            System.out.println("Popped from Integer stack: " + intStack.pop());
        }

        // Test with String
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("!");

        while (!stringStack.isEmpty()) {
            System.out.println("Popped from String stack: " + stringStack.pop());
        }

        // Test with Double
        GenericStack<Double> doubleStack = new GenericStack<>();
        doubleStack.push(3.14);
        doubleStack.push(2.71);
        doubleStack.push(1.618);

        while (!doubleStack.isEmpty()) {
            System.out.println("Popped from Double stack: " + doubleStack.pop());
        }
    }

}
