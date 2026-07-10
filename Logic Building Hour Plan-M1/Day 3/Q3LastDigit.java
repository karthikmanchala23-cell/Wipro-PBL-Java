import java.util.Scanner;

public class Q3LastDigit {

    public static int lastDigit(int n) {
        return Math.abs(n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Last Digit = " + lastDigit(n));

        sc.close();
    }
}