package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Q2EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Karthik");
        employees.add("Rahul");
        employees.add("Anitha");
        employees.add("Priya");
        employees.add("Suresh");

        System.out.println("Employee Names:");

        Iterator<String> itr = employees.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}