package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellingLog {
    private String sellingLog;
    private Date date;
    private int receivedAmount;
    private int reducedAmountForSales;
    private List<Goods> soldGoods;
    private String customerName;
    private DeliveringStatus deliveringStatus;

    public SellingLog(String sellingLog, String customerName) {
        this.sellingLog = sellingLog;
        soldGoods=new ArrayList<>();
        this.customerName = customerName;
        this.date=new Date();
        this.deliveringStatus=DeliveringStatus.delivering;

    }

    public String getSellingLog() {
        return sellingLog;
    }

    public Date getDate() {
        return date;
    }

    public int getReceivedAmount() {
        return receivedAmount;
    }

    public int getReducedAmountForSales() {
        return reducedAmountForSales;
    }

    public List<Goods> getSoldGoods() {
        return soldGoods;
    }

    public String getCustomerName() {
        return customerName;
    }

    public DeliveringStatus getDeliveringStatus() {
        return deliveringStatus;
    }
}
