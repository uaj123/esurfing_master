package cn.uaj.service.impl;

import cn.uaj.dao.ProvinceDao;
import cn.uaj.dao.impl.ProvinceDaoImpl;
import cn.uaj.entity.Province;
import cn.uaj.jedis.utils.JedisPoolUtils;
import cn.uaj.service.ProvinceService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/11 20:33
 */
public class ProvinceServiceImpl implements ProvinceService {

    private ProvinceDao provinceDao = new ProvinceDaoImpl();

    @Override
    public List<Province> findAll() {
        List<Province> list = provinceDao.findAll();
        return list;
    }

    @Override
    public String findAllJson() {
        /*先从redis缓存中查询数据*/
        // 获取redis客户端连接
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");
        /*判断province_json数据是否为null*/
        if (province_json == null || province_json.length() == 0) {
            /*redis缓存中没有数据，就从数据库中查询*/
            List<Province> list = provinceDao.findAll();
            /*将从数据库中查询的数据序列化为json格式*/
            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(list);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            /*将json数据存入redis缓存*/
            jedis.set("province",province_json);
            // 规还连接
            jedis.close();
        }
        return province_json;
    }

    @Override
    public void update(Integer id, String province) {

        provinceDao.update(id,province);
        // 获取redis客户端连接
        Jedis jedis = JedisPoolUtils.getJedis();
        /*删除缓存中作废的数据*/
        jedis.del("province");
    }

    @Override
    public void save(String province) {

        provinceDao.save(province);
        // 获取redis客户端连接
        Jedis jedis = JedisPoolUtils.getJedis();
        /*删除缓存中作废的数据*/
        jedis.del("province");
    }

    @Override
    public void delete(Integer id) {
        provinceDao.delete(id);
        // 获取redis客户端连接
        Jedis jedis = JedisPoolUtils.getJedis();
        /*删除缓存中作废的数据*/
        jedis.del("province");
    }
}
