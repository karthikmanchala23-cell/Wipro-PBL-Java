import java.util.Optional;

public class Q3OptionalOrElseThrow {

    public static void main(String[] args) {

        Employee emp = null;

        try {

            Employee e = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Employee object is null"));

            e.display();

        } catch (InvalidEmployeeException ex) {

            System.out.println(ex.getMessage());

        }
    }
}