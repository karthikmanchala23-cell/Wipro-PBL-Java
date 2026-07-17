package Collections.Projects;

import java.util.*;

public class Q3SetOfBoxes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Q3Box> set = new LinkedHashSet<>();

        System.out.println("Enter the number of Box");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double l = sc.nextDouble();

            System.out.println("Enter Width");
            double w = sc.nextDouble();

            System.out.println("Enter Height");
            double h = sc.nextDouble();

            set.add(new Q3Box(l, w, h));
        }

        System.out.println("Unique Boxes in the Set are");

        for (Q3Box b : set) {
            System.out.println("Length =" + b.length +
                    " Width =" + b.width +
                    " Height =" + b.height +
                    " Volume =" + b.getVolume());
        }

        sc.close();
    }
}