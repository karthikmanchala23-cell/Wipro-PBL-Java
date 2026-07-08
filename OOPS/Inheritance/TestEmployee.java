public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Rahul",
                650000,
                2022,
                "NI123456");

        System.out.println("Name : " + emp.getName());
        System.out.println("Annual Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("National Insurance Number : " + emp.getNationalInsuranceNumber());
    }
}