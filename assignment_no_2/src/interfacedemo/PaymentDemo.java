package interfacedemo;

//Q3. Write a Java program to create an interface Payment with a method makePayment(). Implement the interface in classes such as CreditCardPayment and UPIPayment.

interface Payment {
 void makePayment(double amount);
}

class CreditCardPayment implements Payment {
 public void makePayment(double amount) {
     System.out.println("Credit Card Payment: " + amount);
 }
}

class UPIPayment implements Payment {
 public void makePayment(double amount) {
     System.out.println("UPI Payment: " + amount);
 }
}

public class PaymentDemo {
 public static void main(String[] args) {
     Payment p1 = new CreditCardPayment();
     Payment p2 = new UPIPayment();

     p1.makePayment(5000);
     p2.makePayment(2500);
 }
}