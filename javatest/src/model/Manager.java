package model;

import java.util.HashMap;
import java.util.Map;

public class Manager extends User {
    public Manager(String userName, String name, String lastName, String emailAddress, String passWord, String telephoneNumber) {
        super(userName, name, lastName, emailAddress, passWord, telephoneNumber);
    }
    public void showAllRequests(){
        DataBase.getDataBase().getAllRequests();
    }
    public void addItemsToSeller(Goods goods,int amount,Seller seller){
        if(!(DataBase.getDataBase().getAllGoods().contains(goods)))
            DataBase.getDataBase().getAllGoods().add(goods);
        int thisSeller=DataBase.getDataBase().getAllSellers().indexOf(seller);
        if(!(DataBase.getDataBase().getAllSellers().get(thisSeller).getAllGoodsForSell().containsKey(goods)))
            DataBase.getDataBase().getAllSellers().get(thisSeller).getAllGoodsForSell().put(goods,amount);
        else{
            int oldAmount=DataBase.getDataBase().getAllSellers().get(thisSeller).getAllGoodsForSell().get(goods);
            DataBase.getDataBase().getAllSellers().get(thisSeller).getAllGoodsForSell().replace(goods,oldAmount,oldAmount+amount);
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
            }
        }
    }
}
