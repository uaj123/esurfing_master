package cn.uaj.dao;

import cn.uaj.entity.Member;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: wushaojie
 * @Date: 2020/2/15 21:48
 */
@Repository
public interface IMemberDao {

    /**
     * 根据id查询会员信息
     * @param id
     * @return
     */
    @Select("select * from member where id=#{id}")
    public Member findById(Integer id) throws Exception;
}
