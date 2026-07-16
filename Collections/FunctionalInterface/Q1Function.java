package Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class Q1Function {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Rahul", "Hyderabad", 30000));
        list.add(new Employee(102, "Priya", "Chennai", 35000));
        list.add(new Employee(103, "Kiran", "Pune", 40000));
        list.add(new Employee(104, "Anil", "Bangalore", 45000));
        list.add(new Employee(105, "Sneha", "Delhi", 50000));

        Function<Employee, String> getLocation = e -> e.location;

        ArrayList<String> locations = new ArrayList<>();

        for (Employee e : list) {
            locations.add(getLocation.apply(e));
        }

        System.out.println("Employee Locations:");
        for (String s : locations) {
            System.out.println(s);
        }
    }
}