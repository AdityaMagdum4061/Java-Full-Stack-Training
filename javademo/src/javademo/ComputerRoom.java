package javademo;

public class ComputerRoom {

    public static void main(String[] args) {

        myRoom cr = new myRoom();
        cr.Show();
    }
}

class myRoom {

    void Show() {
        System.out.println("From ComputerRoom..");
    }
}
