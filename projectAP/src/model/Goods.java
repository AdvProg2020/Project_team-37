package model;

import java.util.ArrayList;

public class Goods {
    private ArrayList<Goods> allGoods;
    private String productId;
    private GoodsStatus goodsStatus;
    private String name;
    private String brand;
    private int price;
    private Seller seller;
    private boolean availability;
    private Category category;
    //special properties
    private String explanation;
    private double averageGrades;
    private ArrayList<Opinion> opinions;

    public Goods(String productId, String name, String brand, int price, Seller seller, Category category) {
        this.productId = productId;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.seller = seller;
        this.category = category;
        opinions=new ArrayList<>();
        allGoods=new ArrayList<>();
    }

    public ArrayList<Goods> getAllGoods() {
        return allGoods;
    }
    public void addToGoods(Goods goods){
        allGoods.add(goods);
    }

    public void removeFromGoods(Goods goods){
        allGoods.remove(goods);
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public Seller getSeller() {
        return seller;
    }

    public Category getCategory() {
        return category;
    }

    public String getExplanation() {
        return explanation;
    }

    public double getAverageGrades() {
        return averageGrades;
    }

    public ArrayList<Opinion> getOpinions() {
        return opinions;
    }
}
