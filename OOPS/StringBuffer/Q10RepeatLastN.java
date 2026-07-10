import java.util.Scanner;

public class Q10RepeatLastN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        String last = str.substring(str.length() - n);

        String result = "";

        for (int i = 0; i < n; i++) {
            result += last;
        }

        System.out.println("Output: " + result);

        sc.close();
    }
}