package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Request {
    private Map<Goods,Integer> itemsRequestForAdding;
    private Map<Goods,Integer> itemsRequestForRemoving;
    private List<Sale> saleRequestForItems;
    private List<Sale> saleRequestForRemoving;
    private Seller seller;

    public Request() {
        itemsRequestForAdding=new HashMap<>();
        itemsRequestForRemoving=new HashMap<>();
        saleRequestForItems=new ArrayList<>();
        saleRequestForRemoving=new ArrayList<>();
    }

    public Map<Goods, Integer>getItemsRequestForAdding() {
        return itemsRequestForAdding;
    }

    public Map<Goods, Integer> getItemsRequestForRemoving() {
        return itemsRequestForRemoving;
    }

    public List <Sale> getSaleRequestForItems() {
        return saleRequestForItems;
    }

    public List<Sale> getSaleRequestForRemoving() {
        return saleRequestForRemoving;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setItemsRequestForAdding(Map<Goods, Integer> itemsRequestForAdding) {
        this.itemsRequestForAdding = itemsRequestForAdding;
    }

    public void setItemsRequestForRemoving(Map<Goods, Integer> itemsRequestForRemoving) {
        this.itemsRequestForRemoving = itemsRequestForRemoving;
    }

    public void setSaleRequestForItems(List<Sale> saleRequestForItems) {
        this.saleRequestForItems = saleRequestForItems;
    }

    public void setSaleRequestForRemoving(List<Sale> saleRequestForRemoving) {
        this.saleRequestForRemoving = saleRequestForRemoving;
    }
}
