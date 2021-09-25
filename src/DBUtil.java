import java.sql.*;

public class DBUtil {

    public final static String url="jdbc:mysql://localhost:3306/productdetails";
    public final static String username="root";
    public final static String password="babli5";
    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);

    return con;


}
}