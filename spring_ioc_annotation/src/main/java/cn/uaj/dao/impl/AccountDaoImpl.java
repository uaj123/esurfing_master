package cn.uaj.dao.impl;

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author wushaojie
 * @date 2020/1/14 16:36
 */

/**
 * 账户的持久层实现类
 * <--xml把对象的创建交给spring来管理配置方式-->
 *         <bean id="accountDao" class="cn.uaj.dao.impl.AccountDaoImpl"
 *            scope="" init-method="" destroy-method="">
 *            <property name="" value="" (或者是) ref=""></property>
 *         </bean>
 *       <--注解配置-->
 */
//@Component("accountDao")
@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {
    @Override
    public List<Account> findAll() {
        return null;
    }
}
