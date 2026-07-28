package MultiThreading.Thread;

class EvenThread extends Thread {

    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

class OddThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println(i);
        }
    }
}

public class Q2EvenOddThreads {

    public static void main(String[] args) {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();

        try {
            even.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        odd.start();
    }
}