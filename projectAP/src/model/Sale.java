package model;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.ArrayList;

public class Sale {
    private String offId;
    private ArrayList<Goods> allGoods;
    private ArrayList<Sale> allSales;
    private SaleStatus saleStatus;
    private DateTimeAtCreation startDate;
    private DateTimeAtCompleted endDate;
    private String saleAmount;

    public Sale(String offId, DateTimeAtCreation startDate, DateTimeAtCompleted endDate, String saleAmount) {
        this.offId = offId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.saleAmount = saleAmount;
        allSales =new ArrayList<>();
    }

    public String getOffId() {
        return offId;
    }

    public ArrayList<Goods> getAllGoods() {
        return allGoods;
    }

    public DateTimeAtCreation getStartDate() {
        return startDate;
    }

    public DateTimeAtCompleted getEndDate() {
        return endDate;
    }

    public String getSaleAmount() {
        return saleAmount;
    }

    public void setOffId(String offId) {
        this.offId = offId;
    }

    public void setStartDate(DateTimeAtCreation startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTimeAtCompleted endDate) {
        this.endDate = endDate;
    }

    public void setSaleAmount(String saleAmount) {
        this.saleAmount = saleAmount;
    }

    public void getSaleById(String offId){
        for (Sale allSale : allSales) {
            allSale.getSaleById(offId);
        }
    }
    public void addGoods(Goods goods){
        allGoods.add(goods);
    }
    public void removeGoods(Goods goods){
        allGoods.remove(goods);
    }
    //HasGoodsId

}
