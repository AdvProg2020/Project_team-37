package model;

import java.util.ArrayList;

public class SuperMarket {
    private ArrayList<Category> allCategories;
    private ArrayList<Category> allCustomers;
    private ArrayList<Category> allDiscounts;
    private ArrayList<Category> allGoods;
    private ArrayList<Category> allGrades;
    private ArrayList<Category> allManager;
    private ArrayList<Category> allOpinions;
    private ArrayList<Category> allPerson;
    private ArrayList<Category> allRequest;
    private ArrayList<Category> allSale;
    private ArrayList<Category> allSellingLog;
    private ArrayList<Category> allShoppingLog;

    public SuperMarket() {
        allCategories=new ArrayList<>();
        allCustomers=new ArrayList<>();
        allDiscounts=new ArrayList<>();
        allGoods=new ArrayList<>();
        allGrades=new ArrayList<>();
        allManager=new ArrayList<>();
        allOpinions=new ArrayList<>();
        allPerson=new ArrayList<>();
        allRequest=new ArrayList<>();
        allSale=new ArrayList<>();
        allSellingLog=new ArrayList<>();
        allShoppingLog=new ArrayList<>();
    }

    public void setAllCategories(ArrayList<Category> allCategories) {
        this.allCategories = allCategories;
    }

    public void setAllCustomers(ArrayList<Category> allCustomers) {
        this.allCustomers = allCustomers;
    }

    public void setAllDiscounts(ArrayList<Category> allDiscounts) {
        this.allDiscounts = allDiscounts;
    }

    public void setAllGoods(ArrayList<Category> allGoods) {
        this.allGoods = allGoods;
    }

    public void setAllGrades(ArrayList<Category> allGrades) {
        this.allGrades = allGrades;
    }

    public void setAllManager(ArrayList<Category> allManager) {
        this.allManager = allManager;
    }

    public void setAllOpinions(ArrayList<Category> allOpinions) {
        this.allOpinions = allOpinions;
    }

    public void setAllPerson(ArrayList<Category> allPerson) {
        this.allPerson = allPerson;
    }

    public void setAllRequest(ArrayList<Category> allRequest) {
        this.allRequest = allRequest;
    }

    public void setAllSale(ArrayList<Category> allSale) {
        this.allSale = allSale;
    }

    public void setAllSellingLog(ArrayList<Category> allSellingLog) {
        this.allSellingLog = allSellingLog;
    }

    public void setAllShoppingLog(ArrayList<Category> allShoppingLog) {
        this.allShoppingLog = allShoppingLog;
    }

    
}
