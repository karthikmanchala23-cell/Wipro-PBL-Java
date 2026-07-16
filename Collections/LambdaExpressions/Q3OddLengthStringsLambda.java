package Collections.LambdaExpression;

import java.util.ArrayList;

public class Q3OddLengthStringsLambda {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Banana");
        al.add("Orange");
        al.add("Mango");
        al.add("Guava");
        al.add("Kiwi");
        al.add("Cherry");
        al.add("Papaya");
        al.add("Grapes");
        al.add("Lemon");

        System.out.println("Strings with Odd Length:");

        al.stream()
          .filter(s -> s.length() % 2 != 0)
          .forEach(s -> System.out.println(s));
    }
}