package MultiThreading.ThreadControlAndPriorites;

public class Q1ThreadDelay extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

            if (i == 5) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {

        Q1ThreadDelay thread = new Q1ThreadDelay();
        thread.start();
    }
}