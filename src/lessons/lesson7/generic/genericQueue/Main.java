package lessons.lesson7.generic.genericQueue;

public class Main {

    public static void main(String[] args) {
        // Test GenericQueue with different data types
        GenericQueue<Integer> intQueue = new GenericQueue<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);

        System.out.println("Integer Queue:");
        while (!intQueue.isEmpty()) {
            System.out.println("Dequeued: " + intQueue.dequeue());
        }

        GenericQueue<String> stringQueue = new GenericQueue<>();
        stringQueue.enqueue("Hello");
        stringQueue.enqueue("World");

        System.out.println("\nString Queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println("Dequeued: " + stringQueue.dequeue());
        }

        GenericQueue<Boolean> booleanQueue = new GenericQueue<>();
        booleanQueue.enqueue(true);
        booleanQueue.enqueue(false);

        System.out.println("\nBoolean Queue:");
        while (!booleanQueue.isEmpty()) {
            System.out.println("Dequeued: " + booleanQueue.dequeue());
        }
    }

}
