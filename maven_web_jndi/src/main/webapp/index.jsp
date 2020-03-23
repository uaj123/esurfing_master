<%--<%@ page import="org.apache.ibatis.session.SqlSessionFactoryBuilder" %>
<%@ page import="org.apache.ibatis.io.Resources" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="cn.uaj.dao.IUserDao" %>
<%@ page import="cn.uaj.entity.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.InputStream" %>--%>
<html>
<body>
<h2>Hello World!这个地方运行失败，待解决</h2>
<%--<%
    //1,读取配置文件 ,jndi配置只能配置web，不能用户java，
    InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
    //2，创建SqlSessionFactory工厂
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
    //3，使用工厂生产SqlSession对象
    SqlSession sqlSession = sessionFactory.openSession();
    //4，使用SqlSession创建Dao接口的代理对象
    IUserDao mapper = sqlSession.getMapper(IUserDao.class);
    //5，使用代理对象执行方法
    List<User> list = mapper.findAll();
    for (User user: list) {
        System.out.println(user);
    }

    //6，释放资源
    sqlSession.close();
    resourceAsStream.close();
%>--%>
</body>
</html>
