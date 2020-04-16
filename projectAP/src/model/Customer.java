package model;
import java.util.HashMap;

public class Customer extends Person {
    private HashMap<Goods,Integer> shoppingCart;
    public Customer(String userName, String passWord) {
        super(userName, passWord);
        shoppingCart=new HashMap<>();
    }
    private int credit;


}
