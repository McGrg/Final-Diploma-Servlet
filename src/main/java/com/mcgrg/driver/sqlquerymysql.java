package com.mcgrg.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by MSI GT70 on 15.02.2017.
 */
public class sqlquerymysql {
    private static String stringDriver = "jdbc:mysql://localhost:5050/diploma?useSSL=false";
    private static String stringUser = "root";
    private static String stringPassword = "MySQLpassword";
    private static Connection con;

    public static Connection sqlDrive() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(stringDriver, stringUser, stringPassword);
        if (con == null) return null;
        return con;
    }
}
