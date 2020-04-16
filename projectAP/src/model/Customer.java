package model;
import java.util.HashMap;

public class Customer extends Person {
    private HashMap<Goods,Integer> shoppingCart;
    private HashMap<Customer,ShoppingLog> shoppingHistory;
    private Discount discount;
    private int credit;
    public Customer(String userName, String passWord) {
        super(userName, passWord);
        shoppingCart=new HashMap<>();
        shoppingHistory=new HashMap<>();

    }

    public HashMap<Goods, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public HashMap<Customer, ShoppingLog> getShoppingHistory() {
        return shoppingHistory;
    }

    public Discount getDiscount() {
        return discount;
    }

    public int getCredit() {
        return credit;
    }
   


}
