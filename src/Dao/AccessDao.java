package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccessDao {
    private Connection connection;

    public AccessDao(Connection connection) {
        this.connection = connection;
    }
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "mhd2323");
        }
        return connection;
    }
}
