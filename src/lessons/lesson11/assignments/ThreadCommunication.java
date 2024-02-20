package lessons.lesson11.assignments;

public class ThreadCommunication {
    public static void main(String[] args) {
        // the shared resource is an instance of the SharedResource class
        final SharedResource sharedResource = new SharedResource();
        
        // A thread is a thread of execution in a program
        // JVM allows an application to have multiple threads of execution running concurrently.
        Thread thread1 = new Thread(() -> {
            try {
                sharedResource.printNumber();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                sharedResource.printLetter();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // both threads are started almost simultaneously

        // print number first then letter
        thread1.start();
        thread2.start();
        
        // print letter first then number
        // thread2.start();
        // thread1.start();
        
    }
}

class SharedResource {
    // This is shared flag
    private boolean isNumberPrinted = false;

    public synchronized void printNumber() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            // Wait until it's the turn for numbers to be printed
            while (isNumberPrinted) {
                wait();
            }

            System.out.print(i + " ");
            isNumberPrinted = true;

            // Notify the waiting thread (thread2) that a number has been printed
            notify();
            
            // Give up the lock so that the other thread can acquire it
            // This lock ensures that only one thread can execute synchronized code at a time for a particular instance of the object
            // If there is no sleep, potentially leading to a scenario where one type (numbers or letters) is printed consecutively for several iterations before the other thread gets a chance.
            // There is a likelihood of one thread dominating the execution.
            Thread.sleep(500);
        }
    }

    public synchronized void printLetter() throws InterruptedException {
        char letter = 'A';

        for (int i = 0; i < 10; i++) {
            // Wait until it's the turn for letters to be printed
            while (!isNumberPrinted) {
                wait();
            }

            System.out.print(letter + " ");
            letter++;
            isNumberPrinted = false;

            // Notify the waiting thread (thread1) that a letter has been printed
            notify();

            // Give up the lock so that the other thread can acquire it
            Thread.sleep(500);
        }
    }
}

