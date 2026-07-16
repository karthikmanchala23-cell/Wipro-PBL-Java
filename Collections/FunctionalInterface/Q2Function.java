package Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

public class Q2Function {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        Function<ArrayList<Integer>, Integer> sum = l -> {
            int total = 0;
            for (int n : l) {
                total += n;
            }
            return total;
        };

        System.out.println("Numbers: " + list);
        System.out.println("Sum = " + sum.apply(list));
    }
}