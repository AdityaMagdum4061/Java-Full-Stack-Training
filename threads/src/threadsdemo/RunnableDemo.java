package threadsdemo; // Package declaration

// MyRunnable class implements the Runnable interface
// It contains the task that will be executed by a thread
class MyRunnable implements Runnable {

    // Override the run() method
    // This method contains the code to be executed by the thread
    @Override
    public void run() {
        System.out.println("Runnable Thread 1 is running...");
    }
}

// Another Runnable implementation
class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable Thread 2 is running...");
    }
}

// Third Runnable implementation
class MyRunnable3 implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable Thread 3 is running...");
    }
}

// Main class
public class RunnableDemo {

    // Program execution starts from here
    public static void main(String[] args) {

        // Create an object of MyRunnable
        MyRunnable r1 = new MyRunnable();

        // Create a Thread object and pass the Runnable object
        Thread t1 = new Thread(r1);

        // Start the thread
        // JVM creates a new thread and calls run() automatically
        t1.start();

        // Create an object of MyRunnable2
        MyRunnable2 r2 = new MyRunnable2();

        // Create another thread
        Thread t2 = new Thread(r2);

        // Start the second thread
        t2.start();

        // Create an object of MyRunnable3
        MyRunnable3 r3 = new MyRunnable3();

        // Create the third thread
        Thread t3 = new Thread(r3);

        // Start the third thread
        t3.start();

        // This statement is executed by the main thread
        System.out.println("Main Thread execution completed.");
        
    }
}