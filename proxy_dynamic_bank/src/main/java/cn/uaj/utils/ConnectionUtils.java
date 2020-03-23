package cn.uaj.utils;

/**
 * @author wushaojie
 * @date 2020/1/16 21:03
 */

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 连接的工具类，用于从数据源中获取一个连接，并且实现和线程的绑定
 */
public class ConnectionUtils {
    private ThreadLocal<Connection> tc = new ThreadLocal<Connection>();
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 获取当前线程上的连接
     * @return
     */
    public Connection getThreadConnection(){
        try {
            // 先从ThreadLocal获取
            Connection connection = tc.get();
            // 判断当前线程上是否有连接
            if (connection == null) {
                // 从数据源中获取一个连接，并且存入ThreadLocal中
                connection = dataSource.getConnection();
                tc.set(connection);
            }
            // 返回当前线程上的连接
            return connection;
        }catch (SQLException e) {
                throw new RuntimeException(e);
        }
    }

    /**
     * 将连接和当前线程解绑
     */
    public void removeConnection(){
        tc.remove();
    }
}
