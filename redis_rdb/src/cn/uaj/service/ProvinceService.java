package cn.uaj.service;

import cn.uaj.entity.Province;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/11 20:32
 */
public interface ProvinceService {

    /**
     * 查询所有省份
     * @return
     */
    public List<Province> findAll();

    /**
     * 使用redis缓存
     * @return
     */
    public String findAllJson();

    /**
     * 修改
     */
    public void update(Integer id,String province);

    /**
     * 保存
     * @param province
     */
    public void save(String province);
    /**
     * 根据id删除
     * @param id
     */
    public void delete(Integer id);
}
