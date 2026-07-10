import java.util.Scanner;

public class Q9AlternateString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String a = sc.nextLine();

        System.out.print("Enter Second String: ");
        String b = sc.nextLine();

        String result = "";

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }

        if (a.length() > b.length()) {
            result += a.substring(min);
        } else if (b.length() > a.length()) {
            result += b.substring(min);
        }

        System.out.println("Output: " + result);

        sc.close();
    }
}