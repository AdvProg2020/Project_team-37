package model;

import java.util.HashMap;

public class ShoppingCart {
    private HashMap<Goods,Integer> items;
    private int totalPrice;
    private Discount discount;
    private Sale sale;

    public ShoppingCart() {
        this.items=new HashMap<>();
    }

    public HashMap<Goods, Integer> getItems() {
        return items;
    }

    public int getTotalPrice() {
        int totalPrice=0;
        for (Goods goods : items.keySet()) {
            totalPrice=goods.getPrice()*items.get(goods)+totalPrice;
        }
        return totalPrice;
    }

    public void setItems(HashMap<Goods, Integer> items) {
        this.items = items;
    }

    public Discount getDiscount() {
        return discount;
    }

    public Sale getSale() {
        return sale;
    }
}
