package Collections.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Q7VectorTest {

    public static void main(String[] args) {

        Vector<VectorEmployee> employees = new Vector<>();

        employees.add(new VectorEmployee(101, "Karthik", 50000));
        employees.add(new VectorEmployee(102, "Ravi", 45000));
        employees.add(new VectorEmployee(103, "Anitha", 55000));

        System.out.println("Using Iterator");
        System.out.println("----------------");

        Iterator<VectorEmployee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println();
        }

        System.out.println("Using Enumeration");
        System.out.println("----------------");

        Enumeration<VectorEmployee> enumeration = employees.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
            System.out.println();
        }
    }
}