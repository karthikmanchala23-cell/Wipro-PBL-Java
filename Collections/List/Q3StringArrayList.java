package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Q3StringArrayList {

    public static void printAll(ArrayList<String> list) {

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("JavaScript");

        System.out.println("Elements in the ArrayList:");

        printAll(list);
    }
}