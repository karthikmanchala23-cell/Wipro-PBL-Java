package MultiThreading.Thread;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }

        System.out.println(getName() + " Completed");
    }
}

public class Q3ThreadPriority {

    public static void main(String[] args) {

        MyThread maxThread = new MyThread("MAX Thread");
        MyThread minThread = new MyThread("MIN Thread");
        MyThread normThread = new MyThread("NORM Thread");

        maxThread.setPriority(Thread.MAX_PRIORITY);
        minThread.setPriority(Thread.MIN_PRIORITY);
        normThread.setPriority(Thread.NORM_PRIORITY);

        maxThread.start();
        minThread.start();
        normThread.start();
    }
}