package model;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.List;

public class Sale {
    private String saleId;
    private List<Goods> goodsWithSales;
    private SaleStatus saleStatus;
    private DateTimeAtCreation startDate;
    private DateTimeAtCompleted endDate;
    private int discountAmount;

    public Sale(String saleId, List<Goods> goodsWithSales, DateTimeAtCreation startDate, DateTimeAtCompleted endDate, int discountAmount) {
        this.saleId = saleId;
        this.goodsWithSales = goodsWithSales;
        this.saleStatus =SaleStatus.waitingToConfirmed;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountAmount = discountAmount;
    }

    public String getSaleId() {
        return saleId;
    }

    public List<Goods> getGoodsWithSales() {
        return goodsWithSales;
    }

    public SaleStatus getSaleStatus() {
        return saleStatus;
    }

    public DateTimeAtCreation getStartDate() {
        return startDate;
    }

    public DateTimeAtCompleted getEndDate() {
        return endDate;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setGoodsWithSales(List<Goods> goodsWithSales) {
        this.goodsWithSales = goodsWithSales;
    }

    public void setSaleStatus(SaleStatus saleStatus) {
        this.saleStatus = saleStatus;
    }

    public void setStartDate(DateTimeAtCreation startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(DateTimeAtCompleted endDate) {
        this.endDate = endDate;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }
}
