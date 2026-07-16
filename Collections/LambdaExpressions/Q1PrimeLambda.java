package Collections.LambdaExpression;

import java.util.ArrayList;
import java.util.Random;

public class Q1PrimeLambda {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        Random r = new Random();

        // Add 25 random numbers
        for (int i = 0; i < 25; i++) {
            al.add(r.nextInt(100) + 1);
        }

        System.out.println("Numbers:");
        System.out.println(al);

        System.out.println("\nPrime Numbers:");

        al.stream()
          .filter(Q1PrimeLambda::isPrime)
          .forEach(n -> System.out.print(n + " "));
    }

    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}