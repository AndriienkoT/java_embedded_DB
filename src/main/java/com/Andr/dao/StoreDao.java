package com.Andr.dao;

/**
 * Created by Tanya on 02/03/2017.
 */
import com.Andr.model.Store;
import java.util.List;


public interface StoreDao {
    public static final String SQL_FIND_ALL = "select * from " + Store.TABLE_NAME;
    public static final String SQL_FIND_BY_ID = SQL_FIND_ALL + " where " + Store.ID_COLUMN + " = ?";
    public static final String SQL_INSERT = "insert into " + Store.TABLE_NAME + " (" + Store.ADDRESS_COLUMN + ") values (?)";
    public static final String SQL_UPDATE = "update " + Store.TABLE_NAME + " set " + Store.ADDRESS_COLUMN +" = ? where " + Store.ID_COLUMN + " = ?";
    public static final String SQL_DELETE = "delete from " + Store.TABLE_NAME + " where " + Store.ID_COLUMN + " = ?";

    public List<Store> findAll();
    public Store findById(int id);
    public void insert(Store store);
    public void update(Store store);
    public void delete(Store store);
}
