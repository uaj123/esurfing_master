package cn.uaj.service.impl;

import cn.uaj.dao.IAccountDao;
import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/14 16:37
 */

/**
 * 账户的业务层实现类
 *     <--xml把对象的创建交给spring来管理配置方式-->
 *          <bean id="accountService" class="cn.uaj.service.impl.AccountServiceImpl"
 *          scope="" init-method="" destroy-method="">
 *  *            <property name="" value="" (或者是) ref=""></property>
 *          </bean>
 *
 *     <--注解配置-->
 *用于创建对象，
 *         @Component: 把当前类对象存入spring容器中，属性：value:用于指定bean的id,
 *         没有value默认id为该类的首字母小写名称
 *         @Controller:一般用于表现层
 *         @Service:一般用于业务层
 *         @Repository:一般用于持久层
 *         以上三个注解功能和@Component一模一样,是spring框架为了提供明确的三层使用的注解，
 *         使我们的三层对象更加清晰
 *用于注入数据的：
 *          @Autowired : 属性：value
 *          @Qualifier : 属性：value
 *          @Resource :作用：直接按照bean的id注入，可以独立使用
 *                      属性：name :用于指定bean的id
 *          以上三个注入都只能注入其他bean类型的数据，而基本类型和String类型无法使用上述注解实现，
 *          另外，集合类型的注入只能通过XML实现
 *
 *          @Value:作用：用于注入基本类型和String类型的数据
 *                  属性：value:用于指定数据的值，它可以使用spring中SpEl(spring的el表达式)--->${表达式}
 *
 * 用于改变作用范围的：
 *          @Scope:作用：用于指定bean的作用范围
 *                  属性：value：指定范围的取值，常用取值：不写@Scope()默认singleton(单例)， prototype(多例)
 *
 */

//@Component("accountService")
@Service("accountService")
/*@Scope(value = "singleton")*/
public class AccountServiceImpl implements IAccountService {
    // name不能省略
    @Resource(name = "accountDao")
    private IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }
}
