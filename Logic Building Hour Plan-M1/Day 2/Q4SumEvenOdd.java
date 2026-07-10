import java.util.Scanner;

public class Q4SumEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);

        if (sum % 2 == 0) {
            System.out.println("Sum is EVEN");
        } else {
            System.out.println("Sum is ODD");
        }

        sc.close();
    }
}