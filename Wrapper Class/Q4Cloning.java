package WrapperClass;

public class Q4Cloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee emp1 = new Employee(101, "Karthik", 50000);

        Employee emp2 = (Employee) emp1.clone();

        // Change original object
        emp1.setName("Rahul");
        emp1.setSalary(60000);

        System.out.println("Original Employee:");
        emp1.display();

        System.out.println();

        System.out.println("Cloned Employee:");
        emp2.display();
    }
}