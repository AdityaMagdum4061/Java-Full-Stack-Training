package encapsulationdemo;

// Q3. Write a Java program to implement encapsulation in a BankAccount class and provide methods for depositing and withdrawing money.

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(10000);
        account.withdraw(2500);

        System.out.println("Balance: " + account.getBalance());
    }
}