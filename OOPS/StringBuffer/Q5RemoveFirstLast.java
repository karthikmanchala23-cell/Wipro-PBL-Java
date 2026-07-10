import java.util.Scanner;

public class Q5RemoveFirstLast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        if (str.length() <= 2) {
            System.out.println("");
        } else {
            System.out.println(str.substring(1, str.length() - 1));
        }

        sc.close();
    }
}