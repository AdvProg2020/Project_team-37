package model;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.ArrayList;

public class Discount {
    private String disCountCode;
    private DateTimeAtCreation startDate;
    private DateTimeAtCompleted endDate;
    private int disCountAmount;
    private ArrayList<Customer> allCustomers;

    public Discount(String disCountCode, DateTimeAtCreation startDate, DateTimeAtCompleted endDate, int disCountAmount) {
        this.disCountCode = disCountCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.disCountAmount = disCountAmount;
        allCustomers =new ArrayList<>();
    }

    public String getDisCountCode() {
        return disCountCode;
    }

    public DateTimeAtCreation getStartDate() {
        return startDate;
    }

    public DateTimeAtCompleted getEndDate() {
        return endDate;
    }

    public int getDisCountAmount() {
        return disCountAmount;
    }

    public void setDisCountAmount(int disCountAmount) {
        this.disCountAmount = disCountAmount;
    }

    public void addCustomer(Customer customer){
        allCustomers.add(customer);
    }
    public void removeCustomer(Customer customer){
        allCustomers.remove(customer);
    }

}
