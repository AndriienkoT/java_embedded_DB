package com.Andr.model;

/**
 * Created by Tanya on 02/03/2017.
 */
import java.security.Provider;
import java.util.HashSet;
import java.util.Set;

public class Goods {
    public static final String TABLE_NAME = "goods";
    public static final String ID_COLUMN = "id";
    public static final String NAME_COLUMN = "name";
    public static final String STORE_ID_COLUMN = "store_id";

    private int id;
    private String name;
    private int store_id;
    private Set<Provider> providers = new HashSet<Provider>();

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

    public Set<Provider> getProviders() {
        return providers;
    }

    public void setProviders(Set<Provider> providers) {
        this.providers = providers;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String toString() {
        return "Goods[id=" + this.id + ", name=" + this.name + "]";
    }
}
