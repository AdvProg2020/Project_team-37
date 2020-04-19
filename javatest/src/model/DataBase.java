package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
   private static DataBase dataBase=new DataBase();
   private List<Customer> allCustomers;
   private List<Category> allCategory;
   private List<Comment> allComments;
   private List<Discount> allDiscounts;
   private List<Goods> allGoods;
   private Map<Goods,Integer> goodsWithCount;
   private List<Manager> allManagers;
   private List<Rate> allRates;
   private List<Sale> allSales;
   private List<Seller> allSellers;
   private List<SellingLog> allSellingLog;
   private Map<Customer,ShoppingLog> allShoppingLogs;
   private List<User> allUsers;
   private List<Request> allRequests;

    private DataBase() {
        this.allCustomers = new ArrayList<>();
        this.allCategory = new ArrayList<>();
        this.allComments = new ArrayList<>();
        this.allDiscounts = new ArrayList<>();
        this.allGoods = new ArrayList<>();
        this.allManagers = new ArrayList<>();
        this.allRates = new ArrayList<>();
        this.allSales = new ArrayList<>();
        this.allSellers = new ArrayList<>();
        this.allSellingLog = new ArrayList<>();
        this.allShoppingLogs = new HashMap<>();
        this.allUsers = new ArrayList<>();
        this.allRequests=new ArrayList<>();
        this.goodsWithCount=new HashMap<>();
    }

    public static DataBase getDataBase() {
        return dataBase;
    }

    public List<Customer> getAllCustomers() {
        return allCustomers;
    }

    public List<Category> getAllCategory() {
        return allCategory;
    }

    public List<Comment> getAllComments() {
        return allComments;
    }

    public List<Discount> getAllDiscounts() {
        return allDiscounts;
    }

    public List<Goods> getAllGoods() {
        return allGoods;
    }

    public List<Manager> getAllManagers() {
        return allManagers;
    }

    public List<Rate> getAllRates() {
        return allRates;
    }

    public List<Sale> getAllSales() {
        return allSales;
    }

    public List<Seller> getAllSellers() {
        return allSellers;
    }

    public List<SellingLog> getAllSellingLog() {
        return allSellingLog;
    }

    public Map<Customer, ShoppingLog> getAllShoppingLogs() {
        return allShoppingLogs;
    }

    public List<User> getAllUsers() {
        return allUsers;
    }

    public List<Request> getAllRequests() {
        return allRequests;
    }

    public Map<Goods, Integer> getGoodsWithCount() {
        return goodsWithCount;
    }
}
