package MultiThreading.ThreadCreation;

import java.util.Random;

class ColorTask implements Runnable {

    String[] colors = {"white", "blue", "black", "green", "red", "yellow"};

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            int index = random.nextInt(colors.length);

            System.out.println(colors[index]);

            if (colors[index].equals("red")) {
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q2ColorDisplay {

    public static void main(String[] args) {

        Thread t = new Thread(new ColorTask());
        t.start();

    }
}