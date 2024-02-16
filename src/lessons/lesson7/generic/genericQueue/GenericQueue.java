package lessons.lesson7.generic.genericQueue;

public class GenericQueue<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int front;
    private int rear;
    private int size;

    public GenericQueue() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(T item) {
        if (size == array.length) {
            resizeArray();
        }
        rear = (rear + 1) % array.length;
        array[rear] = item;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = (T) array[front];
        front = (front + 1) % array.length;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resizeArray() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[(front + i) % array.length];
        }

        array = newArray;
        front = 0;
        rear = size - 1;
    }

}
