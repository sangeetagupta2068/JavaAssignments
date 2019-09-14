package com.domain.sangeetagupta.database_connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found.");
        }
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Can't Connect with MySQL");
        }
        return connection;
    }
}
