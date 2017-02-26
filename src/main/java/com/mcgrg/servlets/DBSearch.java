package com.mcgrg.servlets;

import com.mcgrg.driver.sqlquerymysql;
import com.mcgrg.entity.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by MSI GT70 on 15.02.2017.
 */
public class DBSearch {
    private Connection con = null;

    public DBSearch() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        con = sqlquerymysql.sqlDrive();
    }

    public List<Authentifikation> getAuthentifikation(String stringSQL) throws SQLException {
        List<Authentifikation> list = null;
        list = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(stringSQL);
        while (rs.next()) {
            Authentifikation auth = new Authentifikation();
            auth.setAuthentifikation_id(rs.getInt("authentifikation_id"));
            auth.setAuthentifikation_name(rs.getString("authentifikation_name"));
            auth.setAuthentifikation_password(rs.getString("authentifikation_password"));
            list.add(auth);
        }
        rs.close();
        stmt.close();
        return list;
    }

    public List<ConstructionSite> getSites(String stringSQL) throws SQLException {
        List<ConstructionSite> list = null;
        list = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(stringSQL);
        while (rs.next()) {
            ConstructionSite site = new ConstructionSite();
            site.setConssiteId(rs.getInt("cons_site_id"));
            site.setConssiteCity(rs.getString("cons_site_city"));
            site.setConssiteStreet(rs.getString("cons_site_street"));
            site.setConssiteBilding(rs.getString("cons_site_bilding"));
            site.setStartDate(rs.getString("start_date"));
            site.setFinishDate(rs.getString("finish_date"));
            site.setManager(rs.getString("manager"));
            list.add(site);
        }
        rs.close();
        stmt.close();
        return list;
    }

    public List<Debitstandart> getDebitstandart(String stringSQL) throws SQLException {
        List<Debitstandart> list = null;
        list = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(stringSQL);
        while (rs.next()) {
            Debitstandart debit = new Debitstandart();
            debit.setDebitStandartID(rs.getInt("DebitStandart_ID"));
            debit.setDebitStandartSiteID(rs.getInt("DebitStandart_site_ID"));
            debit.setDebitStandartMaterials(rs.getInt("DebitStandart_materials"));
            debit.setDebitStandartValue(rs.getFloat("DebitStandart_value"));
            debit.setDebitStandartPilesTypeId(rs.getInt("DebitStandart_piles_type_id"));
            list.add(debit);
        }
        rs.close();
        stmt.close();
        return list;
    }

    public List<Materials> getMaterials(String stringSQL) throws SQLException {
        List<Materials> list = null;
        list = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(stringSQL);
        while (rs.next()) {
            Materials materials = new Materials();
            materials.setMaterialsId(rs.getInt("Materials_ID"));
            materials.setMaterialsName(rs.getString("materials_name"));
            list.add(materials);
        }
        rs.close();
        stmt.close();
        return list;
    }

    public List<Operations> getOperations(String stringSQL) throws SQLException {
        List<Operations> list = null;
        list = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(stringSQL);
        while (rs.next()) {
            Operations oper = new Operations();
            oper.setOperationsId(rs.getInt("Operations_id"));
            oper.setOperationsType(rs.getInt("Operation_type"));
            oper.setOperationsDate(rs.getDate("Operation_date"));
            oper.setOperationsSiteId(rs.getInt("Operation_site_id"));
            oper.setOperationsMaterials(rs.getInt("Operation_materials"));
            oper.setOperationsMaterialsAmount(rs.getFloat("Operation_materials_amount"));
            list.add(oper);
        }
        rs.close();
        stmt.close();
        return list;
    }

    public List<Opertype> getOpertype(String stringSQL) throws SQLException {
        List<Opertype> list = null;
        list = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(stringSQL);
        while (rs.next()) {
            Opertype opertype = new Opertype();
            opertype.setOperTypeId(rs.getInt("Materials_ID"));
            opertype.setOperTypeName(rs.getInt("materials_name"));
            list.add(opertype);
        }
        rs.close();
        stmt.close();
        return list;
    }

    public List<PileTypes> getPiletypes(String stringSQL) throws SQLException {
        List<PileTypes> list = null;
        list = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(stringSQL);
        while (rs.next()) {
            PileTypes pileTypes = new PileTypes();
            pileTypes.setPileTypesId(rs.getInt("Pile_types_id"));
            pileTypes.setPileTypesName(rs.getString("Pile_types_name"));
            pileTypes.setPileTypesAmount(rs.getInt("Pile_types_amount"));
            pileTypes.setPileTypesSiteId(rs.getInt("Pile_types_site_id"));
            list.add(pileTypes);
        }
        rs.close();
        stmt.close();
        return list;
    }

    public List<Stock> getStock(String stringSQL) throws SQLException {
        List<Stock> list = null;
        list = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(stringSQL);
        while (rs.next()) {
            Stock stock = new Stock();
            stock.setStockId(rs.getInt("stock_id"));
            stock.setStockMaterials(rs.getInt("stock_materials"));
            stock.setStockAmount(rs.getFloat("stock_amount"));
            stock.setStockAmountNeed(rs.getFloat("stock_amount_need"));
            stock.setStockSiteId(rs.getInt("stock_site_id"));
            list.add(stock);
        }
        rs.close();
        stmt.close();
        return list;
    }

    public List<Usergroups> getUsergroups(String stringSQL) throws SQLException {
        List<Usergroups> list = null;
        list = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(stringSQL);
        while (rs.next()) {
            Usergroups usergroups = new Usergroups();
            usergroups.setUsergroupId(rs.getInt("usergroups_id"));
            usergroups.setUsergroupName(rs.getString("usergroup_name"));
            list.add(usergroups);
        }
        rs.close();
        stmt.close();
        return list;
    }


    public List<Users> getUsers(String stringSQL) throws SQLException {
        List<Users> list = null;
        list = new LinkedList<>();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(stringSQL);
        while (rs.next()) {
            Users users = new Users();
            users.setUserID(rs.getInt("users_id"));
            users.setUserName(rs.getString("users_name"));
            users.setUserSurname(rs.getString("users_surname"));
            users.setUserThirdname(rs.getString("users_thirdname"));
            users.setPosition(rs.getString("users_position"));
            list.add(users);
        }
        rs.close();
        stmt.close();
        return list;
    }

    public void close() throws SQLException {
        con.close();
    }
}
