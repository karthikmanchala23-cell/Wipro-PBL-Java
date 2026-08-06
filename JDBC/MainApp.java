import java.util.ArrayList;

/**
 * Driver class that calls each method from every scenario
 * and prints the value obtained, as required by the PBL task.
 */
public class MainApp {

    public static void main(String[] args) {

        UserOperations ops = new UserOperations();

        // Scenario 1
        System.out.println("Scenario 1 - getUserType(AB1001): " + ops.getUserType("AB1001"));

        // Scenario 2
        System.out.println("Scenario 2 - getIncorrectAttempts(AB1001): " + ops.getIncorrectAttempts("AB1001"));

        // Scenario 3
        System.out.println("Scenario 3 - changeUserType(TA1002): " + ops.changeUserType("TA1002"));

        // Scenario 4
        System.out.println("Scenario 4 - getLockStatus(): " + ops.getLockStatus());

        // Scenario 5
        System.out.println("Scenario 5 - changeName(RS1003, Ganesh Kumar): " + ops.changeName("RS1003", "Ganesh Kumar"));

        // Scenario 6
        System.out.println("Scenario 6 - changePassword(NewPass123): " + ops.changePassword("NewPass123"));

        // Scenario 7
        UserBean newUser1 = new UserBean("MK1004", "MK1004", "Manoj", 0, 0, "Employee");
        System.out.println("Scenario 7 - addUser_1(MK1004): " + ops.addUser_1(newUser1));

        // Scenario 8
        UserBean newUser2 = new UserBean("SK1005", "SK1005", "Sanjay", 0, 0, "Employee");
        System.out.println("Scenario 8 - addUser_2(SK1005): " + ops.addUser_2(newUser2));

        // Scenario 9
        System.out.println("Scenario 9 - getUsers(Employee):");
        ArrayList<UserBean> employees = ops.getUsers("Employee");
        for (UserBean bean : employees) {
            System.out.println("   " + bean);
        }

        // Scenario 10
        System.out.println("Scenario 10 - storeAllRecords():");
        ArrayList<UserBean> allRecords = ops.storeAllRecords();
        for (UserBean bean : allRecords) {
            System.out.println("   " + bean);
        }

        // Scenario 11
        System.out.println("Scenario 11 - getNames():");
        String[] names = ops.getNames();
        for (String name : names) {
            System.out.println("   " + name);
        }
    }
}
