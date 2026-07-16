package Collections.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class Q2ReverseStringsLambda {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        al.add("Pineapple");
        al.add("Guava");
        al.add("Cherry");
        al.add("Papaya");
        al.add("Kiwi");

        System.out.println("Original List:");
        System.out.println(al);

        System.out.println("\nReverse Order:");

        Collections.sort(al, (a, b) -> b.compareTo(a));

        al.forEach(s -> System.out.println(s));
    }
}