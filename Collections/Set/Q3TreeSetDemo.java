package Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Q3TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("India");
        names.add("Japan");
        names.add("Australia");
        names.add("USA");
        names.add("Canada");

        System.out.println("Reverse Order:");

        Iterator<String> reverse = names.descendingIterator();
        while (reverse.hasNext()) {
            System.out.println(reverse.next());
        }

        System.out.println("\nNormal Order:");

        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        String search = "India";

        if (names.contains(search)) {
            System.out.println("\n" + search + " is present.");
        } else {
            System.out.println("\n" + search + " is not present.");
        }
    }
}