package MultiThreading.MiniProject;

public class RaceThread extends Thread {

    private boolean isHare;
    public static volatile boolean raceFinished = false;

    public RaceThread(String name, boolean isHare) {
        super(name);
        this.isHare = isHare;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100 && !raceFinished; i++) {

            System.out.println(getName() + " : " + i + " meters");

            if (isHare && i == 60) {
                try {
                    System.out.println(getName() + " is sleeping...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (i == 100 && !raceFinished) {
                raceFinished = true;
                System.out.println(getName() + " wins the race!");
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}