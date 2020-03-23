package cn.uaj.dao;

import cn.uaj.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/3/6 16:44
 * 需要符合springDataJpa的dao层接口规范:
 *  JpaRepository<操作的实体类类型,实体类中主键属性的类型> :
 *      封装了基本CRUD操作
 *  JpaSpecificationExecutor<操作的实体类类型>：
 *      封装了复杂查询（如分页）
 */
public interface ICustomerDao extends JpaRepository<Customer,Long> , JpaSpecificationExecutor<Customer> {
    /**
     * 根据客户名称查询客户，使用jpql的形式查询
     * 配置jpql语句，使用@Query注解,?1代表参数的占位符，其中1对应方法中的参数索引
     * @param custName
     * @return
     */
    @Query(value = "from Customer where custName = ?1")
    public Customer findJpql(String custName);

    /**
     * 使用jpql
     * 根据id和名称查询,?1和?2代表参数的占位符，其中1和2对应接口方法中的参数索引
     * @param custName
     * @param id
     * @return
     */
    @Query(value = "from Customer where custName = ?1 and custId = ?2")
    public Customer findByCustNameAndId(String custName,Long id);

    /**
     * 使用jpql完成跟新操作
     *      案例：根据id跟新
     * @Query：代表的是进行查询，更新需要声明此方法是用来进行更新操作的
     *          使用@Modifying:代表当前执行的是更新操作
     */
    @Query(value = "update Customer set custName = ?2 where custId = ?1")
    @Modifying
    public void updateCustomer(Long custId,String custName);


    /**
     * 使用sql的形式查询
     * nativeQuery: 查询方式
     *      true : 代表sql查询
     *      false: 代表jpql查询
     */
    @Query(value = "select * from cst_customer",nativeQuery = true)
    public List<Object[]> findSql();


    /**
     * 根据客户名称查询
     * 方法名的规则：
     *      findBy* : 代表查询，*可以是对象中的属性名(首字母大写)，就是查询的条件
     *      springDataJpa运行阶段会对符合命名规则的方法进行解析
     */
    public Customer findByCustName(String custName);

    /**
     * 方法名的规范：
     *      1,findBy + 属性名称 ： 根据属性名称进行完全匹配查询
     *      2,findBy + 属性名称 + "查询方式(Like | isnull)" ：
     *              findByCustNameLike : 根据名称进行模糊匹配查询
     *      3,多条件查询：
     *          findBy + 属性名 + "查询方式" + "多条件的连接符(and | or)" +属性名 + "查询方式"
     */
    public List<Customer> findByCustNameLike(String custName);

    /**
     * 使用客户名称模糊匹配和客户所属行业精准匹配的查询
     */
    public List<Customer> findByCustNameLikeAndCustIndustry(String custName,String custIndustry);
}
