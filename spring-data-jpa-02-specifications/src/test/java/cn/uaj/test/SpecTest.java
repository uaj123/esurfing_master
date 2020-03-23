package cn.uaj.test;

import cn.uaj.dao.ICustomerDao;
import cn.uaj.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.criteria.*;
import java.util.List;
import java.util.Optional;

/**
 * @Author: wushaojie
 * @Date: 2020/3/8 13:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpecTest {

    @Autowired
    private ICustomerDao customerDao;

    /**
     * 根据条件查询单个对象
     */
    @Test
    public void testSpec(){
        // 匿名内部类
        /**
         * 自定义查询条件  ：
         *      1，实现Specification接口(提供泛型,查询的对象类型)
         *      2，实现toPredicate方法(构造查询条件)
         *      3,徐借助方法参数中的两个参数{
         *           root: 获取需要查询的对象属性
         *           CriteriaBuilder:构造条件的，内部封装了很多的查询条件（模糊匹配，精准匹配）
         *
         */
        Specification<Customer> specification = new Specification<Customer>() {
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                // 1，获取比较的属性
                Path<Object> custName = root.get("custName");
                // 2,构造查询条件
                /**
                 * equal方法：第一个参数：需要比较的属性（path对象），第二个参数：需要比较的属性取值
                 */
                Predicate predicate = criteriaBuilder.equal(custName, "陈杰");// 进行精准匹配（比较的属性，比较的属性的取值）
                return predicate;

            }
        };
        Optional<Customer> customer = customerDao.findOne(specification);
        System.out.println(customer);
    }

    /**
     * 多条件查询：
     *      根据客户名和客户所属行业查询
     */
    @Test
    public void spec1(){
        /**
         * root:获取属性：客户名，所属行业
         * CriteriaBuilder : 构造查询
         *      1，构造客户名的精准匹配查询
         *      2，构造所属行业的精准匹配查询
         *      3，将以上两个查询联系起来
         */
        Specification<Customer> specification = new Specification<Customer>() {

            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path<Object> custName = root.get("custName");
                Path<Object> custIndustry = root.get("custIndustry");

                // 构造查询
                Predicate predicate = criteriaBuilder.equal(custName, "陈姐");
                Predicate predicate1 = criteriaBuilder.equal(custIndustry, "食品");
                // 将多个查询条件组合到一起：拼接（and | or）
                Predicate and = criteriaBuilder.and(predicate, predicate1);
                return and;
            }
        };
        Optional<Customer> customer = customerDao.findOne(specification);
        System.out.println(customer);

    }

    /**
     * 根据名称模糊查询
     *
     */
    @Test
    public void testLike(){
        /**
         * criteriaBuilder：equal方法：直接得到path对象，进行比较
         *          gt,lt,ge,le,like:得到path对象，根据path对象指定比较的参数类型
         *          ，在进行比较，使用path.as(类型的字节码)
         */
        Specification<Customer> specification = new Specification<Customer>() {
            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path<Object> custName = root.get("custName");
                // 查询方式：模糊查询
                Predicate like = criteriaBuilder.like(custName.as(String.class), "陈%");
                return like;
            }
        };

        List<Customer> list = customerDao.findAll(specification);
        /**
         * iter快捷键
         */
        for (Customer customer : list) {
            System.out.println(customer);
        }
        System.out.println("------------------");
        /**
         * 添加排序：
         *      1，创建排序对象，需要调用构造方法实例化sort对象
         *          1，第一个参数：排序的顺序（Sort.Direction.DESC:倒叙，Sort.Direction.ASC:升序）
         *          2，第二个参数：排序的属性名称
         */
        Sort sort = new Sort(Sort.Direction.DESC, "custId");
        List<Customer> list1 = customerDao.findAll(specification, sort);
        for (Customer customer1 : list1) {
            System.out.println(customer1);
        }
        /**
         * 根据条件统计个数：
         *      long count(Specification<T> specification) // 统计查询
         */
        long count = customerDao.count(specification);
        System.out.println(count);
    }

    /**
     * 分页查询：
     *      Specification:查询条件
     *      Pageable:分页参数
     *          查询的页码，每页查询的条数
     *          findAll(Specification,Pageable) ：带条件的分页
     *          findAll(Pageable)：没有条件的分页
     *      返回：Page(springDataJpa为我们封装好的pageBean)
     */
    @Test
    public void testSpec2(){
        Specification<Customer> specification = null;
        /**
         * PageRequest对象是Pageable接口的实现类
         *  创建PageRequest的过程，需要调用PageRequest.of()方法传入两个参数
         *      第一个参数：当前查询的页数（从0开始）
         *      第二个参数：每页查询的数量
         */
        Pageable pageable = PageRequest.of(0,2);
        Page<Customer> list = customerDao.findAll(specification, pageable);
        System.out.println(list.getTotalElements());// 获取总记录数
        System.out.println(list.getTotalPages());// 获取总页数
        System.out.println(list.getContent());// 获取数据列表
    }














}
