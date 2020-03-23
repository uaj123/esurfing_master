package cn.uaj.dao;

import cn.uaj.entity.Items;

/**
 * @Author: wushaojie
 * @Date: 2020/2/10 17:23
 */
public interface ItemsDao {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Items findById(Integer id);

    /**
     * 保存
     * @param items
     */
    public void saveItems(Items items);
}
