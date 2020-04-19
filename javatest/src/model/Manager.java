package model;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager extends User {
    private List<Discount> discounts;
    public Manager(String userName, String name, String lastName, String emailAddress, String passWord, String telephoneNumber) {
        super(userName, name, lastName, emailAddress, passWord, telephoneNumber);
        discounts=new ArrayList<>();
    }

    public void showAllRequests() {
        DataBase.getDataBase().getAllRequests();
    }

    public void addItemsToSeller(Goods goods, int amount, Seller seller) {
        if (!(DataBase.getDataBase().getAllGoods().contains(goods)))
            DataBase.getDataBase().getAllGoods().add(goods);
        int thisSeller = DataBase.getDataBase().getAllSellers().indexOf(seller);
        if (!(DataBase.getDataBase().getAllSellers().get(thisSeller).getAllGoodsForSell().containsKey(goods)))
            DataBase.getDataBase().getAllSellers().get(thisSeller).getAllGoodsForSell().put(goods, amount);
        else {
            int oldAmount = DataBase.getDataBase().getAllSellers().get(thisSeller).getAllGoodsForSell().get(goods);
            DataBase.getDataBase().getAllSellers().get(thisSeller).getAllGoodsForSell().replace(goods, oldAmount, oldAmount + amount);
        }
    }

    public void removeItemsToSeller(Goods goods, int amount, Seller seller) {
        int thisSeller = DataBase.getDataBase().getAllSellers().indexOf(seller);
        if (!(DataBase.getDataBase().getAllSellers().get(thisSeller).getAllGoodsForSell().containsKey(goods))){
            System.out.println("this seller has not have this items");}
        else if(amount>DataBase.getDataBase().getAllSellers().get(thisSeller).getAllGoodsForSell().get(goods)){
        System.out.println("this seller has less item");}
        else {
            int oldAmount = DataBase.getDataBase().getAllSellers().get(thisSeller).getAllGoodsForSell().get(goods);
            DataBase.getDataBase().getAllSellers().get(thisSeller).getAllGoodsForSell().replace(goods, oldAmount, oldAmount -amount);
        }
    }

    public void acceptRequestForAddingItems(Request request) {
        if (!(DataBase.getDataBase().getAllRequests().contains(request))) {
            System.out.println("not found");
        } else {
            int thisRequest = DataBase.getDataBase().getAllRequests().indexOf(request);
            Map<Goods, Integer> items = new HashMap<>(DataBase.getDataBase().getAllRequests().get(thisRequest).getItemsRequestForAdding());
            for (Goods goods : items.keySet()) {
                addItemsToSeller(goods, items.get(goods), request.getSeller());
                goods.setGoodsStatus(GoodsStatus.confirmed);
            }

        }
    }

    public void rejectForAddingItems(Request request) {
        if (!(DataBase.getDataBase().getAllRequests().contains(request))) {
            System.out.println("not found");
        }else{
            DataBase.getDataBase().getAllRequests().remove(request);
        }
    }

    public void addSale(String saleId, List<Goods> goodsWithSales, DateTimeAtCreation startDate, DateTimeAtCompleted endDate, int discountAmount) {
        Sale newSale = new Sale(saleId,  goodsWithSales, startDate,  endDate,  discountAmount);
        DataBase.getDataBase().getAllSales().add(newSale);
    }
    public void removeSaleForList(Sale sale){
        DataBase.getDataBase().getAllSales().remove(sale);
    }
    public void acceptForMakingNewSale(Request request) {
        if (DataBase.getDataBase().getAllSales().contains(request)) {
            int thisRequest = DataBase.getDataBase().getAllRequests().indexOf(request);
            List<Sale> sales = new ArrayList<>(DataBase.getDataBase().getAllRequests().get(thisRequest).getSaleRequestForItems());
            for (Sale sale : sales) {
                DataBase.getDataBase().getAllSales().add(sale);
                sale.setSaleStatus(SaleStatus.confirmed);
            }
        }else{
            System.out.println("request has not found");
        }
    }
    public void rejectForMakingNewSale(Request request){
        if(!(DataBase.getDataBase().getAllRequests().contains(request)))
            System.out.println("request has not found");
        else{
            DataBase.getDataBase().getAllRequests().remove(request);
        }
    }
    public void showAllDiscounts(){
        DataBase.getDataBase().getAllDiscounts();
    }
    public void addToDiscounts(String discountCode, DateTimeAtCreation startDate, DateTimeAtCompleted endDate, int discountAmount, int numbersOfUseForEachCustomer){
        Discount discount=new Discount( discountCode,  startDate,  endDate,  discountAmount,  numbersOfUseForEachCustomer);
        DataBase.getDataBase().getAllDiscounts().add(discount);
    }
    public void removeForDiscounts(Discount discount){
        DataBase.getDataBase().getAllDiscounts().remove(discount);
    }
    public void changeDiscount(Discount discount){
        //waiting to write;
    }
    public void showAllCustomers(){
        DataBase.getDataBase().getAllCustomers();
    }
    public void removeCustomerByManager(Customer customer){
        DataBase.getDataBase().getAllCustomers().remove(customer);
    }
    public void addManager(String userName, String name, String lastName, String emailAddress, String passWord, String telephoneNumber){
        Manager manager=new Manager( userName,  name,  lastName,  emailAddress,  passWord,  telephoneNumber);
        DataBase.getDataBase().getAllManagers().add(manager);
    }
    public void showAllCategory(){
        DataBase.getDataBase().getAllCategory();
    }
    public void addCategory(String name, SpecialFeature specialFeature){
        Category category=new Category( name,  specialFeature);
        DataBase.getDataBase().getAllCategory().add(category);
    }
    public void changeCategory(Category category){
        //waiting for write;
    }



}
