package com.Andr.model;

/**
 * Created by Tanya on 02/03/2017.
 */
import java.util.HashSet;
import java.util.Set;

public class Provider {
    private int id;
    private String name;
    private Set<Goods> goods = new HashSet<Goods>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Goods> getGoods() {
        return goods;
    }

    public void setGoods(Set<Goods> goods) {
        this.goods = goods;
    }

    public String toString() {
        return "Provider[id=" + this.id + ", name=" + this.name + "]";
    }
}
