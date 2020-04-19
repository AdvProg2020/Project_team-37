package model;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Seller extends User {
    private String companyName;
    private List<SellingLog> sellingHistory;
    private Map<Goods,Integer> allGoodsForSell;
    private Request request;
    private Sale sale;


    public Seller(String userName, String name, String lastName, String emailAddress, String passWord, String telephoneNumber,String companyName) {
        super(userName, name, lastName, emailAddress, passWord, telephoneNumber);
        this.companyName=companyName;
        sellingHistory=new ArrayList<>();
        allGoodsForSell=new HashMap<>();

    }
    public void addRequestForAddingItems(HashMap<Goods,Integer> items){
        request=new Request();
        request.setItemsRequestForAdding(items);
        //can this "this" refer to this Seller;
    }

    public void addRequestForRemovingItems(HashMap<Goods,Integer> items){
        request=new Request();
        request.setItemsRequestForRemoving(items);
    }

    public void addRequestForMakingNewSale(String saleId, List<Goods> goodsWithSales, SaleStatus saleStatus, DateTimeAtCreation startDate, DateTimeAtCompleted endDate, int discountAmount){
        sale=new Sale( saleId,goodsWithSales,startDate,endDate,discountAmount);
        request=new Request();
        request.getSaleRequestForItems().add(sale);
    }
    public void addRequestForRemovingSale(Sale sale){
        request=new Request();
        request.getSaleRequestForRemoving().remove(sale);
    }

    public void showAllSales(){
        DataBase.getDataBase().getAllSales();
    }

    public String getCompanyName() {
        return companyName;
    }

    public Map<Goods, Integer> getAllGoodsForSell() {
        return allGoodsForSell;
    }
}
