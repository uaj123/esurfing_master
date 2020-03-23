package cn.uaj.test;

import cn.uaj.dao.ICustomerDao;
import cn.uaj.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/3/6 20:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JpqlTest {

    @Autowired
    private ICustomerDao customerDao;

    @Test
    public void testFindJpql(){
        Customer customer = customerDao.findJpql("陈姐");
        System.out.println(customer);
    }
    @Test
    public void findByCustNameAndId(){
        Customer customer = customerDao.findByCustNameAndId("陈斯", 2L);
        System.out.println(customer);
    }

    /**
     * springDataJPA中使用jpql完成更新和删除操作
     *          ：必须手动添加事务的支持
     *          ：默认会在执行结束后，回滚事务
     *          ：需要添加@Rollback(value=false) ,设置是否自动回滚
     */
    @Test
    @Transactional // 添加事务支持
    @Rollback(value = false)
    public void testUpdateCustomer(){
        customerDao.updateCustomer(2L,"何玲");
    }

    /**
     * 使用sql查询
     */
    @Test
    public void testFindSql(){
        List<Object[]> list = customerDao.findSql();
        for (Object[] o :list) {
            System.out.println(Arrays.toString(o));
        }

    }

    /**
     * 使用符合jpql规范的方法查询
     */
    @Test
    public void findByCustName(){
        Customer customer = customerDao.findByCustName("陈姐");
        System.out.println(customer);
    }
    /**
     * 使用jpql命名规范进行模糊查询
     */
    @Test
    public void findByCustNameLike(){
        List<Customer> customers = customerDao.findByCustNameLike("陈%");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    /**
     * 使用客户名称模糊匹配和客户所属行业精准匹配的查询
     */
    @Test
    public void findByCustNameLikeAndCustIndustry(){
        List<Customer> list = customerDao.findByCustNameLikeAndCustIndustry("陈%", "食品");
        for (Customer customer :list) {
            System.out.println(customer);

        }

    }
}

