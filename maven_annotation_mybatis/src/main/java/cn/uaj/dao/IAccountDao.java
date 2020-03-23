package cn.uaj.dao;

import cn.uaj.entity.Account;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/14 11:32
 */
public interface IAccountDao {

    /**
     * 查询全部账户信息和每个账户所属的用户
     * @return
     */
    @Select("select * from account")
    /*多对一和一对一,（mybatis中多对一视为一对一），一般使用立即加载和one=@one()注解*/
    @Results(id = "accountMap", value =
            {
                    @Result(id = true,column = "id", property = "id"),
                    @Result(property = "uid",column = "uid"),
                    @Result(property = "money",column = "money"),
                    @Result(property = "user",column = "uid",
                            one = @One(select = "cn.uaj.dao.IUserDao.findById",fetchType = FetchType.EAGER))

            }
       )
    List<Account> findAll();

    /**
     * 根据id查询账户信息
     * @param id
     * @return
     */
    @Select("select * from account where id = #{id}")
    Account findById(Integer id);

    /**
     * 根据用户id查询账户信息
     * @param uid
     * @return
     */
    @Select("select * from account where uid = #{uid}")
    List<Account> findAccountByUid(Integer uid);
}
