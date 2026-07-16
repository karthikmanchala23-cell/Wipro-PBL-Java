package OOPS.iostream.ObjectSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q1EmployeeSerialization {

    public static void main(String[] args) {

        try {
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            Date dob = format.parse("15-08-2000");

            Employee employee = new Employee(
                    "Vijaykanth",
                    dob,
                    "AID",
                    "Software Engineer",
                    100000.0
            );

            ObjectOutputStream output =
                    new ObjectOutputStream(new FileOutputStream("data"));

            output.writeObject(employee);
            output.close();

            System.out.println("Employee object saved successfully.");

            ObjectInputStream input =
                    new ObjectInputStream(new FileInputStream("data"));

            Employee restoredEmployee = (Employee) input.readObject();
            input.close();

            System.out.println("\nEmployee Details:");
            System.out.println("Name: " + restoredEmployee.getName());
            System.out.println("Date of Birth: "
                    + format.format(restoredEmployee.getDateOfBirth()));
            System.out.println("Department: "
                    + restoredEmployee.getDepartment());
            System.out.println("Designation: "
                    + restoredEmployee.getDesignation());
            System.out.println("Salary: "
                    + restoredEmployee.getSalary());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}