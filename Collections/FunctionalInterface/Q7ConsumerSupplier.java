package Collections.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Q7ConsumerSupplier {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Welcome to Wipro";

        Consumer<String> consumer = s -> System.out.println(s);

        String message = supplier.get();

        consumer.accept(message);
    }
}