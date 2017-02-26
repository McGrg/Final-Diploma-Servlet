package com.mcgrg.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by MSI GT70 on 15.02.2017.
 */
public class sqlquerymssql {
    private static String strDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String strURL = "jdbc:sqlserver://192.168.1.249:54874;databaseName=Diploma;integratedSecurity=true;";
    private static Connection con;

    public static Connection sqlDrive() throws ClassNotFoundException, SQLException {
        Class.forName(strDriver);
        con = DriverManager.getConnection(strURL);
        if (con == null) return null;
        return con;
    }
}
