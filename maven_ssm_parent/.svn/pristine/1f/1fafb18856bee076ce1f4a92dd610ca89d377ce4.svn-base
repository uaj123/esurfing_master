package cn.uaj.service.impl;

import cn.uaj.dao.ItemsDao;
import cn.uaj.entity.Items;
import cn.uaj.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wushaojie
 * @Date: 2020/2/10 19:00
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }

    @Override
    public void saveItems(Items items) {
        itemsDao.saveItems(items);
    }
}
