package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Customer extends User{
    private int credit;
    private ShoppingCart shoppingCart;
    private List<ShoppingLog> shoppingHistory;
    public Customer(String userName, String name, String lastName, String emailAddress, String passWord, String telephoneNumber) {
        super(userName, name, lastName, emailAddress, passWord, telephoneNumber);
        this.shoppingHistory=new ArrayList<>();
        shoppingCart=new ShoppingCart();
    }
    public void addToDataBase(Customer customer){
        DataBase.getDataBase().getAllCustomers().add(customer);
    }
    public void showAllGoods(){
        DataBase.getDataBase().getAllGoods();
    }
    public void addToShoppingCart(HashMap<Goods,Integer> items){
        shoppingCart.setItems(items);
    }
    public void removeFromShoppingCart(HashMap<Goods,Integer> items){
        shoppingCart.getItems().remove(items);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public List<ShoppingLog> showShoppingHistory(){
        return shoppingHistory;
    }

    public Goods search(String goodName){
        for (Goods goods : DataBase.getDataBase().getAllGoods()) {
            if ((goodName.trim()).equalsIgnoreCase(goods.getName()))
                return goods;
        }
        System.err.println("Not Found");
        return null;
    }
    public void buy(){
        String input=scanner.nextLine();
        System.out.println( getShoppingCart());
        System.out.println("Total Price:"+shoppingCart.getTotalPrice());
        System.out.println("Are you sure about buying?");
        if(input.trim().equalsIgnoreCase("yes")){
            if(credit>=shoppingCart.getTotalPrice()){
                credit=credit-shoppingCart.getTotalPrice();
                ShoppingLog shoppingLog=new ShoppingLog();
                shoppingLog.setPurchasedGoods(shoppingCart.getItems());
                shoppingHistory.add(shoppingLog);
                //this buying is without discount
            }

        }else if(input.trim().equalsIgnoreCase("no"));
            else{
            System.err.println("invalid Command");
        }
    }

    public List<ShoppingLog> getShoppingHistory() {
        return shoppingHistory;
    }
    public void compareTwoGoods(Goods good1,Goods good2){
        //waiting to write
    }
}
