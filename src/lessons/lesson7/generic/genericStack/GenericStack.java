package lessons.lesson7.generic.genericStack;

import java.util.LinkedList;

public class GenericStack<T> {
    private LinkedList<T> stackList;

    public GenericStack() {
        this.stackList = new LinkedList<>();
    }

    public void push(T item) {
        stackList.addFirst(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackList.removeFirst();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }
}