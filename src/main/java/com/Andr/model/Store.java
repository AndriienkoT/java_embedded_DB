package com.Andr.model;

/**
 * Created by Tanya on 02/03/2017.
 */
import java.util.HashSet;
import java.util.Set;

public class Store {
    public static final String TABLE_NAME = "stores";
    public static final String ID_COLUMN = "id";
    public static final String ADDRESS_COLUMN = "address";

    private int id;
    private String address;
    private Set<Goods> goods = new HashSet<Goods>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Goods> getGoods() {
        return goods;
    }

    public void setGoods(Set<Goods> goods) {
        this.goods = goods;
    }

    public String toString() {
        return "Store[id=" + this.id + ", address=" + this.address + "]";
    }
}

