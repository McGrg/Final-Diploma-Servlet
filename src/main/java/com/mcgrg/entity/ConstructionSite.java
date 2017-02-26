package com.mcgrg.entity;

/**
 * Created by MSI GT70 on 15.02.2017.
 */
public class ConstructionSite  extends DataBaseEntity {
    private int conssiteId;
    private String conssiteCity;
    private String conssiteStreet;
    private String conssiteBilding;
    private String startDate;
    private String finishDate;
    private String manager;

    public int getConssiteId() {
        return conssiteId;
    }

    public void setConssiteId(int conssiteId) {
        this.conssiteId = conssiteId;
    }

    public String getConssiteCity() {
        return conssiteCity;
    }

    public void setConssiteCity(String conssiteCity) {
        this.conssiteCity = conssiteCity;
    }

    public String getConssiteStreet() {
        return conssiteStreet;
    }

    public void setConssiteStreet(String conssiteStreet) {
        this.conssiteStreet = conssiteStreet;
    }

    public String getConssiteBilding() {
        return conssiteBilding;
    }

    public void setConssiteBilding(String conssiteBilding) {
        this.conssiteBilding = conssiteBilding;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "ID: " + this.getConssiteId() + " " + this.getConssiteCity() + " "
                + this.getConssiteStreet().toString() + " " + this.getConssiteBilding() + " "
                + this.getStartDate() + " " + this.getFinishDate() + " " + this.getManager();
    }

//    private final SimpleIntegerProperty conssiteId=null;
//    private final SimpleStringProperty conssiteCity=null;
//    private final SimpleStringProperty conssiteStreet=null;
//    private final SimpleStringProperty conssiteBilding=null;
//    private final SimpleStringProperty startDate=null;
//    private final SimpleStringProperty finishDate=null;
//    private final SimpleStringProperty manager=null;
//
//    public int getConssiteId() {
//        return conssiteId.get();
//    }
//
//    public void setConssiteId(int value) {
//        conssiteId.set(value);
//    }
//
//    public SimpleIntegerProperty conssiteIdProperty() {
//        return conssiteId;
//    }
//
//    public String getConssiteCity() {
//        return conssiteCity.get();
//    }
//
//    public void setConssiteCity(String value) {
//        conssiteCity.set(value);
//    }
//
//    public SimpleStringProperty conssiteCityProperty() {
//        return conssiteCity;
//    }
//
//    public String getConssiteStreet() {
//        return conssiteStreet.get();
//    }
//
//    public void setConssiteStreet(String value) {
//        this.conssiteStreet.set(value);
//    }
//
//    public SimpleStringProperty conssiteStreetProperty() {
//        return conssiteStreet;
//    }
//
//    public String getConssiteBilding() {
//        return conssiteBilding.get();
//    }
//
//    public void setConssiteBilding(String value) {
//        this.conssiteBilding.set(value);
//    }
//
//    public SimpleStringProperty conssiteBildingProperty() {
//        return conssiteBilding;
//    }
//
//    public String getStartDate() {
//        return startDate.get();
//    }
//
//    public void setStartDate(String value) {
//        this.startDate.set(value);
//    }
//
//    public SimpleStringProperty conssiteStartDateProperty() {
//        return startDate;
//    }
//
//    public String getFinishDate() {
//        return finishDate.get();
//    }
//
//    public void setFinishDate(String value) {
//        this.finishDate.set(value);
//    }
//
//    public SimpleStringProperty conssiteFinishDateProperty() {
//        return finishDate;
//    }
//
//    public String getManager() {
//        return manager.get();
//    }
//
//    public void setManager(String value) {
//        this.manager.set(value);
//    }
//
//    public SimpleStringProperty conssiteManagerProperty() {
//        return manager;
//    }
//
//    @Override
//    public String toString() {
//        return "ID: " + getConssiteId() + " " + getConssiteCity() + " "
//                + getConssiteStreet() + " " + getConssiteBilding() + " "
//                + getStartDate() + " " + getFinishDate() + " " + getManager();
//    }

//    public ConstructionSites(Integer conssiteId, String conssiteCity,
//                             String conssiteStreet, String conssiteBilding,
//                             String startDate, String finishDate,
//                             String manager) {
//        this.conssiteId = new SimpleIntegerProperty(conssiteId);
//        this.conssiteCity = new SimpleStringProperty(conssiteCity);
//        this.conssiteStreet = new SimpleStringProperty(conssiteStreet);
//        this.conssiteBilding = new SimpleStringProperty(conssiteBilding);
//        this.startDate = new SimpleStringProperty(startDate);
//        this.finishDate = new SimpleStringProperty(finishDate);
//        this.manager = new SimpleStringProperty(manager);
//    }


}
