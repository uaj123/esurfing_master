package cn.uaj.test;

import cn.uaj.dao.ICustomerDao;
import cn.uaj.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @Author: wushaojie
 * @Date: 2020/3/6 16:50
 */
@RunWith(SpringJUnit4ClassRunner.class) // 声明spring提供的单元测试环境
@ContextConfiguration(locations = "classpath:applicationContext.xml") // 指定spring容器的配置信息
public class CustomerDaoTest {

    @Autowired
    private ICustomerDao customerDao;

    /**
     * save:保存或者更新
     *      如果传递的对象存在主键id,执行跟新操作，没有主键id,执行保存操作
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    @Test
    public void testSave() throws IllegalAccessException, InstantiationException {
        Class<Customer> customerClass = Customer.class;
        Customer customer = customerClass.newInstance();
        customer.setCustAddress("江西");
        customer.setCustName("陈新奇");
        customer.setCustPhone("13135689684");
        customer.setCustIndustry("食品");
        customer.setCustSource("网络");
        customer.setCustLevel("2级");
        customerDao.save(customer);
    }

    /**
     * 根据id 查询,数据库中不存在数据不会报错，立即加载
     */
    @Test
    public void testFindById(){
        //Optional 容器类：用于尽量避免空指针异常
        // 如果有值对其处理，并返回处理后的Optional，否则返回 Optional.empty()
        Optional<Customer> customer = customerDao.findById(1L);
        System.out.println(customer);
    }

    /**
     * 根据id从数据库查询，数据库中没数据会报错，延迟加载，返回一个客户的动态代理对象，什么时候用，什么时候执行
     */
    @Test
    @Transactional // 保证getOne能正常运行
    public void testGetOne(){
        Customer customer = customerDao.getOne(2L);
        System.out.println(customer);
    }
    /**
     * 统计查询
     */
    @Test
    public void testCount(){
        long count = customerDao.count();
        System.out.println(count);
    }

    /**
     * 根据id删除
     */
    @Test
    public void testDelete(){
        customerDao.deleteById(1L);
    }

    /**
     * 查询全部
     */
    @Test
    public void testFindAll(){
        List<Customer> list = customerDao.findAll();
        for (Customer customer :list) {
            System.out.println(customer);
        }

    }

    /**
     * 根据id判断客户是否存在
     */
    @Test
    public void testExists(){
        boolean bl = customerDao.existsById(1L);
        System.out.println("id为2的客户是否存在:" + bl);
    }
}
