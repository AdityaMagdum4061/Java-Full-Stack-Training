package opps_concept;

public abstract class AbstractClass {

    // Abstract method
    abstract void sound();

    // Non-abstract method
    void sleep() {
        System.out.println("Animal is sleeping..");
    }

    public static void main(String[] args) {

        Dog1 d = new Dog1();

        d.sound();
        d.sleep();
    }
}

class Dog1 extends AbstractClass {

    @Override
    void sound() {
        System.out.println("Barks..");
    }
}