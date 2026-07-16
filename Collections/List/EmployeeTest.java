package Collections.List;

public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Karthik", "karthik@gmail.com", "Male", 50000);
        Employee e2 = new Employee(102, "Ravi", "ravi@gmail.com", "Male", 45000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        System.out.println("Employee Details");
        db.showAllEmployees();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println("\nAfter Deleting Employee 102");
        db.showAllEmployees();
    }
}