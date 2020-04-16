package model;

public class Grade {
    private Customer customer;
    private int point;
    private Goods goods;

    public Grade(Customer customer, int point, Goods goods) {
        this.customer = customer;
        this.point = point;
        this.goods = goods;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getPoint() {
        return point;
    }

    public Goods getGoods() {
        return goods;
    }

}
