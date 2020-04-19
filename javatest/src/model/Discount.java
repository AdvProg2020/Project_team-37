package model;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.ArrayList;
import java.util.List;

public class Discount {
    private String discountCode;
    private DateTimeAtCreation startDate;
    private DateTimeAtCompleted endDate;
    private int discountAmount;
    private int numbersOfUseForEachCustomer;
    private List<Customer> CustomersWithThisCode;

    public Discount(String discountCode, DateTimeAtCreation startDate, DateTimeAtCompleted endDate, int discountAmount, int numbersOfUseForEachCustomer) {
        this.discountCode = discountCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountAmount = discountAmount;
        this.numbersOfUseForEachCustomer = numbersOfUseForEachCustomer;
        CustomersWithThisCode = new ArrayList<>();
    }

    public String getDiscountCode() {
        return discountCode;
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

    public int getNumbersOfUseForEachCustomer() {
        return numbersOfUseForEachCustomer;
    }

    public List<Customer> getCustomersWithThisCode() {
        return CustomersWithThisCode;
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

    public void setNumbersOfUseForEachCustomer(int numbersOfUseForEachCustomer) {
        this.numbersOfUseForEachCustomer = numbersOfUseForEachCustomer;
    }

}
