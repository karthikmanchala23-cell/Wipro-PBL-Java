package Collections.Projects;

import java.util.*;

public class EmployeeRegister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        TreeSet<Employee> list = new TreeSet<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Employee " + i + " Details");

            System.out.print("First Name: ");
            String first = sc.nextLine();

            System.out.print("Last Name: ");
            String last = sc.nextLine();

            System.out.print("Mobile: ");
            String mobile = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            list.add(new Employee(first, last, mobile, email, address));
        }

        System.out.println("\nEmployee List");
        System.out.printf("%-15s %-15s %-15s %-30s %-15s\n",
                "FirstName", "LastName", "Mobile", "Email", "Address");

        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();
    }
}