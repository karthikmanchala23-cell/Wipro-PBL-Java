package Collections.FunctionalInterface;

import java.util.function.Supplier;

public class Q6Supplier {

    public static void main(String[] args) {

        Supplier<Double> randomNumber = () -> Math.random();

        System.out.println("Random Numbers:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(randomNumber.get());
        }
    }
}