package com.mcgrg.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by MSI GT70 on 19.02.2017.
 */
@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        String[] stringSQL = null;
        String[] tableName = null;
        String report = null;
        Map<String, String[]> map = request.getParameterMap();
        //Reading the Map
        //Works for GET && POST Method
        stringSQL = map.get("sql");
        tableName = map.get("table");
        report = "SQL: " + stringSQL[0] + " " + "tableName: " + tableName[0];

        try {
            DBInsert db = new DBInsert();
            report = db.setUsergroups(stringSQL[0]);
            if (db != null) {
                db.close();
            }
        } catch (Exception e) {
            report = e.toString();
        } finally {
            PrintWriter outsites = response.getWriter();
            outsites.println(report);
            outsites.close();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
