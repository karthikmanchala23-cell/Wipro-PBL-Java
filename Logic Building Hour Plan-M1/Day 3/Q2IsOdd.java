import java.util.Scanner;

public class Q2IsOdd {

    public static int isOdd(int n) {
        if (n != 0 && n % 2 != 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(isOdd(n));

        sc.close();
    }
}