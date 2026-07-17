package Collections.Projects;

import java.util.*;

public class Q1_CollectUniqueCards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<String, Integer> map = new TreeMap<>();
        int count = 0;

        while (map.size() < 4) {
            System.out.println("Enter a card:");
            String symbol = sc.next();
            int number = sc.nextInt();
            count++;

            if (!map.containsKey(symbol)) {
                map.put(symbol, number);
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards");
        System.out.println("Cards in Set are");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        sc.close();
    }
}