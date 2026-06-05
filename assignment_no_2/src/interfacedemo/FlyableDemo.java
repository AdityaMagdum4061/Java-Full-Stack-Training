package interfacedemo;

// Create an interface Flyable and implement it in classes Bird and Airplane.

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is Flying");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane is Flying");
    }
}

public class FlyableDemo {
    public static void main(String[] args) {
        Flyable f1 = new Bird();
        Flyable f2 = new Airplane();

        f1.fly();
        f2.fly();
    }
}