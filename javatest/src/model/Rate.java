package model;

public class Rate {
    private Customer customer;
    private int rate;
    private Goods goods;

    public Rate( int rate, Goods goods) {
        this.rate = rate;
        this.goods = goods;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getRate() {
        return rate;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
