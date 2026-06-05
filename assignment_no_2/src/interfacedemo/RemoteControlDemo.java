package interfacedemo;

// Create an interface RemoteControl and implement it for TV and AirConditioner classes.

interface RemoteControl {
    void turnOn();
    void turnOff();
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV Turned On");
    }

    public void turnOff() {
        System.out.println("TV Turned Off");
    }
}

class AirConditioner implements RemoteControl {
    public void turnOn() {
        System.out.println("AC Turned On");
    }

    public void turnOff() {
        System.out.println("AC Turned Off");
    }
}

public class RemoteControlDemo {
    public static void main(String[] args) {
        RemoteControl r1 = new TV();
        RemoteControl r2 = new AirConditioner();

        r1.turnOn();
        r1.turnOff();

        r2.turnOn();
        r2.turnOff();
    }
}