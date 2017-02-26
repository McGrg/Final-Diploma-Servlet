package com.mcgrg.servlets;

import com.mcgrg.driver.sqlquerymysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by MSI GT70 on 19.02.2017.
 */
public class DBInsert {
    private Connection con = null;

    public DBInsert() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        con = sqlquerymysql.sqlDrive();
    }

    public String setUsergroups(String stringSQL) throws SQLException{
        Statement stmt = con.createStatement();
        stmt.executeUpdate(stringSQL);
        stmt.close();
        return "Inserting is successful!";
    }

    public void close()throws SQLException{
        con.close();
    }
}
