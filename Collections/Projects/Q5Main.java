package Collections.Projects;

import java.util.*;

public class Q5Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter S1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter S2: ");
        String s2 = sc.nextLine();

        Q5StringOperations obj = new Q5StringOperations();

        ArrayList<String> result = obj.performOperations(s1, s2);

        System.out.println(result);

        sc.close();
    }
}