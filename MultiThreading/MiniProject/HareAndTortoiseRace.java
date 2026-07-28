package MultiThreading.MiniProject;

public class HareAndTortoiseRace {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare", true);
        RaceThread tortoise = new RaceThread("Tortoise", false);

        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}