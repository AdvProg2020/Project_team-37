package model;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private SpecialFeature specialFeature;
    private List<Goods> goods;

    public Category(String name, SpecialFeature specialFeature) {
        this.name = name;
        this.specialFeature = specialFeature;
        goods=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public SpecialFeature getSpecialFeature() {
        return specialFeature;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setSpecialFeature(SpecialFeature specialFeature) {
        this.specialFeature = specialFeature;
    }
}
