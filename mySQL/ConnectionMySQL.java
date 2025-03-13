import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL{
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/test_db";
        String user = "root";
        String password = "";
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection succeed: ");
        }
        catch (SQLException | ClassNotFoundException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        return conn;
    }
    public static void main(String[] args){
        getConnection();
    } 
}