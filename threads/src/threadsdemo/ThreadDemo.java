package threadsdemo;   // Defines the package name

// MyThread class extends the Thread class
// By extending Thread, this class can create and run a separate thread
class MyThread extends Thread {

    // The run() method contains the code that will be executed by the thread
    @Override
    public void run() {

        // Display a message when the thread starts running
        System.out.println("Thread is running...");
    }
}

// Main class
public class ThreadDemo {

    // Main method - execution of the program starts from here
    public static void main(String[] args) {

        // Create an object of MyThread
        // At this point, the thread is in the NEW state
        MyThread t1 = new MyThread();

        // Start the thread
        // A new thread is created by the JVM
        // The JVM automatically calls the run() method
        t1.start();

        // This statement is executed by the main thread
        System.out.println("Main method execution completed.");
    }
}