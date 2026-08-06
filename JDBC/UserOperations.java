import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * TM809 -> RDBMS / SQL / JDBC
 * Implements Scenario 1 through Scenario 11.
 */
public class UserOperations {

    // ---------------------------------------------------------------
    // Scenario 1: String getUserType(String userID)
    // ---------------------------------------------------------------
    public String getUserType(String userID) {
        String userType = null;
        String sql = "SELECT UserType FROM users WHERE UserID = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, userID);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    userType = rs.getString("UserType");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error in getUserType: " + e.getMessage());
        }
        return userType;
    }

    // ---------------------------------------------------------------
    // Scenario 2: String getIncorrectAttempts(String userID)
    // ---------------------------------------------------------------
    public String getIncorrectAttempts(String userID) {
        String result = null;
        String sql = "SELECT IncorrectAttempts FROM users WHERE UserID = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, userID);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int attempts = rs.getInt("IncorrectAttempts");
                    if (attempts == 0) {
                        result = "No Incorrect Attempt";
                    } else if (attempts == 1) {
                        result = "One Time";
                    } else {
                        result = "Incorrect Attempt Exceeded";
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error in getIncorrectAttempts: " + e.getMessage());
        }
        return result;
    }

    // ---------------------------------------------------------------
    // Scenario 3: String changeUserType(String userID)
    // Updates the user type of the given userID to "Admin".
    // ---------------------------------------------------------------
    public String changeUserType(String userID) {
        String result = "Update Failed";
        String sql = "UPDATE users SET UserType = 'Admin' WHERE UserID = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, userID);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated >= 1) {
                result = "Update Success";
            }
        } catch (SQLException e) {
            System.out.println("Error in changeUserType: " + e.getMessage());
        }
        return result;
    }

    // ---------------------------------------------------------------
    // Scenario 4: int getLockStatus()
    // Counts the total rows where LockStatus = 0
    // ---------------------------------------------------------------
    public int getLockStatus() {
        int count = 0;
        String sql = "SELECT COUNT(*) AS total FROM users WHERE LockStatus = 0";

        try (Connection connection = DBConnection.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) {
                count = rs.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println("Error in getLockStatus: " + e.getMessage());
        }
        return count;
    }

    // ---------------------------------------------------------------
    // Scenario 5: String changeName(String id, String name)
    // ---------------------------------------------------------------
    public String changeName(String id, String name) {
        String result = "Failed";
        String sql = "UPDATE users SET Name = ? WHERE UserID = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, id);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                result = "Success";
            }
        } catch (SQLException e) {
            System.out.println("Error in changeName: " + e.getMessage());
        }
        return result;
    }

    // ---------------------------------------------------------------
    // Scenario 6: String changePassword(String password)
    // Changes password for ALL records with UserType = 'Admin'
    // ---------------------------------------------------------------
    public String changePassword(String password) {
        String result = "0";
        String sql = "UPDATE users SET Password = ? WHERE UserType = 'Admin'";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, password);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                result = "Changed";
            }
        } catch (SQLException e) {
            System.out.println("Error in changePassword: " + e.getMessage());
        }
        return result;
    }

    // ---------------------------------------------------------------
    // Scenario 7: String addUser_1(UserBean bean)
    // Inserts a new record using the values from the bean.
    // ---------------------------------------------------------------
    public String addUser_1(UserBean bean) {
        String result = "Fail";
        String sql = "INSERT INTO users (UserID, Password, Name, IncorrectAttempts, LockStatus, UserType) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, bean.getId());
            ps.setString(2, bean.getPassword());
            ps.setString(3, bean.getName());
            ps.setInt(4, bean.getIncorrectAttempts());
            ps.setInt(5, bean.getLockStatus());
            ps.setString(6, bean.getUserType());

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                result = "Success";
            }
        } catch (SQLException e) {
            System.out.println("Error in addUser_1: " + e.getMessage());
        }
        return result;
    }

    // ---------------------------------------------------------------
    // Scenario 8: String addUser_2(UserBean bean)
    // Inserts a new record only if the bean's lockStatus is 0.
    // ---------------------------------------------------------------
    public String addUser_2(UserBean bean) {
        String result = "Fail";

        if (bean.getLockStatus() != 0) {
            return result;
        }

        String sql = "INSERT INTO users (UserID, Password, Name, IncorrectAttempts, LockStatus, UserType) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, bean.getId());
            ps.setString(2, bean.getPassword());
            ps.setString(3, bean.getName());
            ps.setInt(4, bean.getIncorrectAttempts());
            ps.setInt(5, bean.getLockStatus());
            ps.setString(6, bean.getUserType());

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                result = "Success";
            }
        } catch (SQLException e) {
            System.out.println("Error in addUser_2: " + e.getMessage());
        }
        return result;
    }

    // ---------------------------------------------------------------
    // Scenario 9: ArrayList<UserBean> getUsers(String userType)
    // Retrieves all records matching the given userType.
    // ---------------------------------------------------------------
    public ArrayList<UserBean> getUsers(String userType) {
        ArrayList<UserBean> userList = new ArrayList<>();
        String sql = "SELECT * FROM users WHERE UserType = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, userType);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    userList.add(mapRowToBean(rs));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error in getUsers: " + e.getMessage());
        }
        return userList;
    }

    // ---------------------------------------------------------------
    // Scenario 10: ArrayList<UserBean> storeAllRecords()
    // Retrieves ALL the records and stores them into an ArrayList.
    // ---------------------------------------------------------------
    public ArrayList<UserBean> storeAllRecords() {
        ArrayList<UserBean> allRecords = new ArrayList<>();
        String sql = "SELECT * FROM users";

        try (Connection connection = DBConnection.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                allRecords.add(mapRowToBean(rs));
            }
        } catch (SQLException e) {
            System.out.println("Error in storeAllRecords: " + e.getMessage());
        }
        return allRecords;
    }

    // ---------------------------------------------------------------
    // Scenario 11: String[] getNames()
    // Retrieves all names from the table and stores them in a String array.
    // ---------------------------------------------------------------
    public String[] getNames() {
        ArrayList<String> names = new ArrayList<>();
        String sql = "SELECT Name FROM users";

        try (Connection connection = DBConnection.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                names.add(rs.getString("Name"));
            }
        } catch (SQLException e) {
            System.out.println("Error in getNames: " + e.getMessage());
        }
        return names.toArray(new String[0]);
    }

    // ---------------------------------------------------------------
    // Helper: maps the current row of a ResultSet to a UserBean
    // ---------------------------------------------------------------
    private UserBean mapRowToBean(ResultSet rs) throws SQLException {
        UserBean bean = new UserBean();
        bean.setId(rs.getString("UserID"));
        bean.setPassword(rs.getString("Password"));
        bean.setName(rs.getString("Name"));
        bean.setIncorrectAttempts(rs.getInt("IncorrectAttempts"));
        bean.setLockStatus(rs.getInt("LockStatus"));
        bean.setUserType(rs.getString("UserType"));
        return bean;
    }
}
