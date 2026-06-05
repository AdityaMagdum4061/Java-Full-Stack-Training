package abstractclassdemo;

// Create an abstract class Bank and implement different interest calculation methods in SBI, HDFC, and ICICI classes.

abstract class Bank {
    abstract void calculateInterest(double principal);
}

class SBI extends Bank {
    void calculateInterest(double principal) {
        double interest = principal * 6.5 / 100;
        System.out.println("SBI Interest: " + interest);
    }
}

class HDFC extends Bank {
    void calculateInterest(double principal) {
        double interest = principal * 7.0 / 100;
        System.out.println("HDFC Interest: " + interest);
    }
}

class ICICI extends Bank {
    void calculateInterest(double principal) {
        double interest = principal * 7.5 / 100;
        System.out.println("ICICI Interest: " + interest);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        b1.calculateInterest(100000);
        b2.calculateInterest(100000);
        b3.calculateInterest(100000);
    }
}