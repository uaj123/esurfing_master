package config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author wushaojie
 * @ 2020/1/31
 * 配置事务相关的配置类
 */

public class TransactionConfig {
    /**
     * 用于创建事务管理器对象
     * @param dataSource
     * @return PlatformTransactionManager
     */
    @Bean("transactionManager")
    public PlatformTransactionManager createTransactionManager(DataSource dataSource){
        return  new DataSourceTransactionManager(dataSource);
    }
}
