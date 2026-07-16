package Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Q3Predicate {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("madam");
        list.add("java");
        list.add("level");
        list.add("wipro");
        list.add("radar");
        list.add("hello");
        list.add("malayalam");
        list.add("chat");
        list.add("noon");
        list.add("code");

        Predicate<String> isPalindrome = s ->
                s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

        System.out.println("Palindrome Words:");

        for (String word : list) {
            if (isPalindrome.test(word)) {
                System.out.println(word);
            }
        }
    }
}