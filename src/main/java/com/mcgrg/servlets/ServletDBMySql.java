package com.mcgrg.servlets;

import com.google.gson.Gson;
import com.mcgrg.entity.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

/**
 * Created by MSI GT70 on 14.02.2017.
 */
@WebServlet("/ServletDBMySql")
public class ServletDBMySql extends HttpServlet {
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

        //--------------------------------------------------------------

        try {
            DBSearch db = new DBSearch();
            switch (tableName[0]) {
                case "authentifikation": {
                    List<Authentifikation> auth = db.getAuthentifikation(stringSQL[0]);
                    report = new Gson().toJson(auth);
                    db.close();
                }
                break;
                case "constructionsite": {
                    List<ConstructionSite> sites = db.getSites(stringSQL[0]);
                    report = new Gson().toJson(sites);
                    db.close();
                }
                break;
                case "debitstandart": {
                    List<Debitstandart> auth = db.getDebitstandart(stringSQL[0]);
                    report = new Gson().toJson(auth);
                    db.close();
                }
                break;
                case "materials": {
                    List<Materials> sites = db.getMaterials(stringSQL[0]);
                    report = new Gson().toJson(sites);
                    db.close();
                }
                break;
                case "operations": {
                    List<Operations> auth = db.getOperations(stringSQL[0]);
                    report = new Gson().toJson(auth);
                    db.close();
                }
                break;
                case "opertype": {
                    List<Opertype> auth = db.getOpertype(stringSQL[0]);
                    report = new Gson().toJson(auth);
                    db.close();
                }
                break;
                case "piletypes": {
                    List<PileTypes> auth = db.getPiletypes(stringSQL[0]);
                    report = new Gson().toJson(auth);
                    db.close();
                }
                break;
                case "stock": {
                    List<Stock> auth = db.getStock(stringSQL[0]);
                    report = new Gson().toJson(auth);
                    db.close();
                }
                break;
                case "usergroups": {
                    List<Usergroups> auth = db.getUsergroups(stringSQL[0]);
                    report = new Gson().toJson(auth);
                    db.close();
                }
                break;
                case "users": {
                    List<Users> users = db.getUsers(stringSQL[0]);
                    report = new Gson().toJson(users);
                    db.close();
                }
                break;
                default: {
                    report = " There isn't such a table!";
                }
            }
            db.close();
        } catch (Exception e) {
            report = e.toString();
        } finally {
//            report = report + "tableName: " + tableName + "stringSQL: " + stringSQL;
            PrintWriter outsites = response.getWriter();
            outsites.println( report);
            outsites.close();
        }

        //--------------------------------------------------------------

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
