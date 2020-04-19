package model;

import java.util.*;

public class ShoppingLog {
    private String shoppingLogId;
    private Date date;
    private int paidAmount;
    private int discount;
    private Map<Goods,Integer>purchasedGoods;
    private String sellerName;
    private DeliveringStatus deliveringStatus;

    public ShoppingLog() {
        this.date=new Date();
        this.purchasedGoods=new HashMap<>();
        this.deliveringStatus=DeliveringStatus.delivering;
    }

    public String getShoppingLogId() {
        return shoppingLogId;
    }

    public Date getDate() {
        return date;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public int getDiscount() {
        return discount;
    }

    public Map<Goods, Integer> getPurchasedGoods() {
        return purchasedGoods;
    }

    public String  getSellerName() {
        return sellerName;
    }

    public DeliveringStatus getDeliveringStatus() {
        return deliveringStatus;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    public void setPurchasedGoods(Map<Goods, Integer> purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }
}
