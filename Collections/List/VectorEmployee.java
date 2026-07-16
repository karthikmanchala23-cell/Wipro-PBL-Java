package Collections.List;

public class VectorEmployee {

    int empId;
    String empName;
    float salary;

    public VectorEmployee(int empId, String empName, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID : " + empId +
                "\nEmployee Name : " + empName +
                "\nSalary : " + salary;
    }
}