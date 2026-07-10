import java.util.Scanner;

public class Q8RemoveStar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int star = str.indexOf('*');

        String result = str.substring(0, star - 1) +
                str.substring(star + 2);

        System.out.println("Output: " + result);

        sc.close();
    }
}