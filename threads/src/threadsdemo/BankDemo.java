package threadsdemo; // Package declaration

// BankAccount class represents a shared bank account
class BankAccount {

    // Initial account balance
    private int balance = 1000;

    // synchronized keyword ensures that only one thread
    // can execute this method at a time
    synchronized void withdraw(int amount) {

        // Check whether sufficient balance is available
        if (balance >= amount) {

            // Display which customer is withdrawing money
            System.out.println(
                    Thread.currentThread().getName()
                    + " withdrawing " + amount);

            // Deduct the withdrawal amount from balance
            balance -= amount;

            // Display the remaining balance
            System.out.println(
                    "Remaining Balance : " + balance);
        } else {

            // Display message if balance is insufficient
            System.out.println(
                    Thread.currentThread().getName()
                    + " : Insufficient Balance");
        }
    }
}

// Customer class extends Thread
// Each customer acts as a separate thread
class Customer extends Thread {

    // Reference to the shared BankAccount object
    BankAccount account;

    // Constructor to initialize the account reference
    Customer(BankAccount account) {
        this.account = account;
    }

    // Task performed by each customer thread
    @Override
    public void run() {

        // Attempt to withdraw 700 from the shared account
        account.withdraw(700);
    }
}

// Main class
public class BankDemo {

    // Program execution starts here
    public static void main(String[] args) {

        // Create a shared bank account object
        BankAccount account = new BankAccount();

        // Create two customer threads sharing the same account
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);

        // Assign names to the threads
        c1.setName("Customer-1");
        c2.setName("Customer-2");

        // Start both customer threads
        c1.start();
        c2.start();
    }
}