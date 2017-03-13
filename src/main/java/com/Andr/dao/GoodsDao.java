package com.Andr.dao;

/**
 * Created by Tanya on 02/03/2017.
 */
import com.Andr.model.Goods;
import java.util.List;


public interface GoodsDao {
    public static final String SQL_FIND_ALL = "select * from " + Goods.TABLE_NAME;
    public static final String SQL_FIND_BY_ID = SQL_FIND_ALL + " where " + Goods.ID_COLUMN + " = ?";
    public static final String SQL_INSERT = "insert into " + Goods.TABLE_NAME + " (" + Goods.NAME_COLUMN + ", " + Goods.STORE_ID_COLUMN + ") values (?, ?)";
    public static final String SQL_UPDATE = "update " + Goods.TABLE_NAME + " set " + Goods.NAME_COLUMN + " where " + Goods.ID_COLUMN + " = ?";
    public static final String SQL_DELETE = "delete from " + Goods.TABLE_NAME + " where " + Goods.ID_COLUMN + " = ?";

    public List<Goods> findAll();
    public Goods findById(int id);
    public void insert(Goods goods);
    public void update(Goods goods);
    public void delete(Goods goods);
}
