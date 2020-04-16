package model;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<SpecialOptions> specialOptions;
    private ArrayList<Goods> allGoods;

    public Category(String name, ArrayList<SpecialOptions> specialOptions, ArrayList<Goods> allGoods) {
        this.name = name;
        specialOptions=new ArrayList<>();
        allGoods=new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public ArrayList<SpecialOptions> getSpecialOptions() {
        return specialOptions;
    }

    public ArrayList<Goods> getAllGoods() {
        return allGoods;
    }

    public void addGood(Goods goods){
        allGoods.add(goods);
    }

    public void removeGood(Goods goods){
        allGoods.remove(goods);
    }

    public void addToSuperMarket(){

    }


}
