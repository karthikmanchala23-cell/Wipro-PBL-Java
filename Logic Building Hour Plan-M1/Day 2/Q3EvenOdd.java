import java.util.Scanner;

public class Q3EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is EVEN");
        } else {
            System.out.println(n + " is ODD");
        }

        sc.close();
    }
}