package Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Q4EmpData {

    private int id;
    private String name;
    private double salary;

    Q4EmpData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Q4Predicate {

    public static void main(String[] args) {

        ArrayList<Q4EmpData> list = new ArrayList<>();

        list.add(new Q4EmpData(101, "Rahul", 9000));
        list.add(new Q4EmpData(102, "Priya", 15000));
        list.add(new Q4EmpData(103, "Kiran", 8000));
        list.add(new Q4EmpData(104, "Anil", 20000));
        list.add(new Q4EmpData(105, "Sneha", 7000));

        Predicate<Q4EmpData> lowSalary =
                e -> e.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");

        for (Q4EmpData e : list) {
            if (lowSalary.test(e)) {
                System.out.println(e.getName());
            }
        }
    }
}