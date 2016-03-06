import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016-03-05.
 */
public class DConnectionMaker implements ConnectionMaker{
    public Connection makeConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/spring", "root", "pass");
    }
}

