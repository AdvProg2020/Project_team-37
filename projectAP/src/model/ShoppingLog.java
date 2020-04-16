package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class ShoppingLog {
    private String logId;
    private Date date;
    private Customer customer;
    private Seller seller;
    private HashMap<Goods,Integer> shoppingList;
    private ShoppingStatus shoppingStatus;
    private ArrayList<ShoppingLog> allShoppingLog;
    private int allDiscount;
    private int payAmount;

    public ShoppingLog(String logId, Customer customer, Seller seller) {
        this.logId = logId;
        this.customer = customer;
        this.seller = seller;
        shoppingList=new HashMap<>();
        allShoppingLog=new ArrayList<>();
    }

    public String getLogId() {
        return logId;
    }

    public Date getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Seller getSeller() {
        return seller;
    }

    public HashMap<Goods, Integer> getShoppingList() {
        return shoppingList;
    }

    public ShoppingStatus getShoppingStatus() {
        return shoppingStatus;
    }

    public ArrayList<ShoppingLog> getAllShoppingLog() {
        return allShoppingLog;
    }

    public int getAllDiscount() {
        return allDiscount;
    }

    public int getPayAmount() {
        return payAmount;
    }


}
