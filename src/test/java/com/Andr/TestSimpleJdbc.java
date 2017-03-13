package com.Andr;

/**
 * Created by Tanya on 02/03/2017.
 */
import com.Andr.dao.GoodsDao;
import com.Andr.dao.StoreDao;
import com.Andr.model.Goods;
import com.Andr.model.Store;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


@ContextConfiguration("classpath:spring-context.xml")
public class TestSimpleJdbc extends AbstractJUnit4SpringContextTests {
    @Autowired
    private StoreDao storeDao;
    @Autowired
    private GoodsDao goodsDao;

    @Test
    public void testStoreCRUD() {
        String testData = "test address";
        // Создать тестовый объект
        Store testStore = new Store();
        testStore.setAddress(testData);
        // Сохранить тестовый объект в базе данных
        storeDao.insert(testStore);
        // Вытащить тестовый объект из базы данных
        Store storeFromDb = storeDao.findById(testStore.getId());
        // Сравнить вытащенный объект из базы данных с тестовым объектом
        assertEquals(testStore.getAddress(), storeFromDb.getAddress());
        // Удалить тестовый объект в базе данных
        storeDao.delete(storeFromDb);
        // Найти удаленный объект в базе данных
        Store removedStore = storeDao.findById(storeFromDb.getId());
        // Сравнить вытащенный объект после удаления из базы данных на null
        assertNull(removedStore);
    }

    @Test
    public void testGoodsCRUD() {
        String testData = "test address";
        // Создать тестовый объект
        Goods testGoods = new Goods();
        testGoods.setName(testData);
        testGoods.setStore_id(1);
        // Сохранить тестовый объект в базе данных
        goodsDao.insert(testGoods);
        // Вытащить тестовый объект из базы данных
        Goods goodsFromDb = goodsDao.findById(testGoods.getId());
        // Сравнить вытащенный объект из базы данных с тестовым объектом
        assertEquals(testGoods.getName(), goodsFromDb.getName());
        // Удалить тестовый объект в базе данных
        goodsDao.delete(goodsFromDb);
        // Найти удаленный объект в базе данных
        Goods removedGoods = goodsDao.findById(goodsFromDb.getId());
        // Сравнить вытащенный объект после удаления из базы данных на null
        assertNull(removedGoods);
    }
}
