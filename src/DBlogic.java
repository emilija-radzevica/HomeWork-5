import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBlogic implements ConnectionToDatabase{
    protected void register(String username, String password) {

        String register = "INSERT INTO registration (username, password) VALUES('"+ username + "','"+ password +"')";
        connect(register);

    }

    @Override
    public void connect(String method) {
        try {
            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(method);

            System.out.println("Dati tika ievadīti");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}