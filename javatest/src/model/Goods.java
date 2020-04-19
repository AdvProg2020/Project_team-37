package model;

import java.util.ArrayList;
import java.util.List;

public class Goods {
    private String goodsId;
    private GoodsStatus goodsStatus;
    private String name;
    private String companyName;
    private int price;
    private List<Seller> sellers;
    private boolean isAvailable;
    private Category category;
    private SpecialFeature specialFeature;
    private String explanation;
    private int averageRate;
    private List<Comment> comments;
    private List<Rate> rates;

    public Goods(String goodsId, String name, String companyName, int price, Category category, SpecialFeature specialFeature, String explanation) {
        this.goodsId = goodsId;
        this.name = name;
        this.companyName = companyName;
        this.price = price;
        this.sellers=new ArrayList<>();
        this.category = category;
        this.specialFeature = specialFeature;
        this.explanation = explanation;
        this.comments=new ArrayList<>();
        rates=new ArrayList<>();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public GoodsStatus getGoodsStatus() {
        return goodsStatus;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getPrice() {
        return price;
    }

    public List<Seller> getSellers() {
        return sellers;
    }

    public boolean isAvailable(Goods goods) {
        if(DataBase.getDataBase().getGoodsWithCount().keySet().contains(goods)){
            if(DataBase.getDataBase().getGoodsWithCount().containsValue(0))
                return false;
            else
                return true;
        }
        return false;

    }

    public Category getCategory() {
        return category;
    }

    public SpecialFeature getSpecialFeature() {
        return specialFeature;
    }

    public String getExplanation() {
        return explanation;
    }

    public int getAverageRate() {
        int sumRates=0;
        for (Rate rate : rates) {
             sumRates=rate.getRate()+sumRates;
        }
        averageRate=sumRates/rates.size();
        return averageRate;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setGoodsStatus(GoodsStatus goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }




}
