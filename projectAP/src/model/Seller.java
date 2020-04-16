package model;

import java.util.ArrayList;

public class Seller extends Person {
    private String companyName;
    private ArrayList<Goods> goods;
    private ArrayList<Sale> sales;
    private int credit;
    public Seller(String userName, String passWord,String companyName) {
        super(userName, passWord);
        this.companyName=companyName;
        goods=new ArrayList<>();
        sales=new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public ArrayList<Goods> getGoods() {
        return goods;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void addGoods(Goods goods){
        this.goods.add(goods);
    }
    public void removeGoods(Goods goods){
        this.goods.remove(goods);
    }
    public void addSale(Sale sale){
        this.sales.add(sale);
    }
    public void removeSale(Sale sale){
        this.sales.remove(sale);
    }
}
