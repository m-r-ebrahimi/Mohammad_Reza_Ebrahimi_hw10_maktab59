package Q1.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DbConfig.DRIVER);
        return DriverManager.getConnection(DbConfig.URL,DbConfig.USERNAME,DbConfig.PASSWORD);
    }
}
