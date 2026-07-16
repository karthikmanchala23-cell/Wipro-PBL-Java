package Collections.List;

import java.util.ArrayList;

public class Q4NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20.5);
        numbers.add(15.75f);
        numbers.add(100L);
        numbers.add((short)50);
        numbers.add((byte)5);

        System.out.println("Numbers in the ArrayList:");

        for (Number n : numbers) {
            System.out.println(n);
        }
    }
}