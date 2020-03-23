package cn.uaj.dao.impl;

import cn.uaj.dao.ProvinceDao;
import cn.uaj.entity.Province;
import cn.uaj.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/2/11 20:32
 */
public class ProvinceDaoImpl implements ProvinceDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Province> findAll() {
        String sql = "select * from province";
        List<Province> list = template.query(sql, new BeanPropertyRowMapper<Province>(Province.class));
        return list.isEmpty() ? null : list;
    }

    @Override
    public void update(Integer id,String province) {
        String sql = "update province set province = ? where id = ? ";
        template.update(sql,province,id);
    }

    @Override
    public void save(String province) {
        String sql = "insert into province(province) value (?)";
        template.update(sql,province);
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from province where id = ?";
        template.update(sql,id);

    }
}
