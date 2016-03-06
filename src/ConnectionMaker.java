import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016-03-06.
 */
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
