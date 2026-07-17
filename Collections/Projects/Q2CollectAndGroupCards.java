package Collections.Projects;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q2CollectAndGroupCards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<String, ArrayList<Q2Card>> cards = new TreeMap<>();

        System.out.println("Enter Number of Cards:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");

            String symbol = sc.next();
            int number = sc.nextInt();

            Q2Card card = new Q2Card(symbol, number);

            if (!cards.containsKey(symbol)) {
                cards.put(symbol, new ArrayList<>());
            }

            cards.get(symbol).add(card);
        }

        System.out.println("Distinct Symbols are:");

        for (String symbol : cards.keySet()) {
            System.out.print(symbol + " ");
        }

        System.out.println();

        for (Map.Entry<String, ArrayList<Q2Card>> entry : cards.entrySet()) {

            String symbol = entry.getKey();
            ArrayList<Q2Card> cardList = entry.getValue();

            int sum = 0;

            System.out.println("Cards in " + symbol + " Symbol");

            for (Q2Card card : cardList) {
                System.out.println(card.symbol + " " + card.number);
                sum = sum + card.number;
            }

            System.out.println("Number of cards: " + cardList.size());
            System.out.println("Sum of Numbers: " + sum);
        }

        sc.close();
    }
}