package Collections.Projects;

public class Employee implements Comparable<Employee> {

    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String address;

    public Employee(String firstName, String lastName,
                    String mobile, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    @Override
    public int compareTo(Employee e) {
        return this.firstName.compareToIgnoreCase(e.firstName);
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15s %-30s %-15s",
                firstName, lastName, mobile, email, address);
    }
}