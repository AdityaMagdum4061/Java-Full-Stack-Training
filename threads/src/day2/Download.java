package day2;

public class Download extends Thread {

    int t = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Downloading.... " + t + "% "+ Thread.currentThread().getName());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            t += 20;
        }
    }

    public static void main(String[] args) {

        Download d1 = new Download();
        Download d2 = new Download();
        Download d3 = new Download();
        Download d4 = new Download();

        d1.setName("Thread 1");
        d2.setName("Thread 2");
        d3.setName("Thread 3");
        d4.setName("Thread 4");

        d1.setPriority(Thread.MAX_PRIORITY);
        d2.setPriority(Thread.MIN_PRIORITY);
        d3.setPriority(1);
        d4.setPriority(2);

        d1.start();
        d2.start();
        d3.start();
        d4.start();
    }
}