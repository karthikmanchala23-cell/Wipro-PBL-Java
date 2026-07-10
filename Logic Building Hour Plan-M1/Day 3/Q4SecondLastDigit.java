import java.util.Scanner;

public class Q4SecondLastDigit {

    public static int secondLastDigit(int n) {

        n = Math.abs(n);

        if (n < 10)
            return -1;

        return (n / 10) % 10;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Second Last Digit = " + secondLastDigit(n));

        sc.close();
    }
}