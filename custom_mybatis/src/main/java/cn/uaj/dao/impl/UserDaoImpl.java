package cn.uaj.dao.impl;

import cn.uaj.dao.IUserDao;
import cn.uaj.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/10 23:01
 */
public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;
    public UserDaoImpl(SqlSessionFactory factory){
        this.factory = factory;
    }
    @Override
    public List<User> findAll() {
        // 根据factory获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        // 调用SqlSession中的方法，实现查询列表，参数为接口类中方法的完全限定名
        List<User> users = sqlSession.selectList("cn.uaj.dao.IUserDao.findAll");
        // 释放资源
        sqlSession.close();
        return users;
    }

    @Override
    public void saveUser(User user) {
        // 根据factory获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        sqlSession.insert("cn.uaj.dao.IUserDao.saveUser",user);
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void updateUser(User user) {
        SqlSession sqlSession = factory.openSession();
        sqlSession.update("cn.uaj.dao.IUserDao.updateUser",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteUser(User user) {
        SqlSession sqlSession = factory.openSession();
        sqlSession.update("cn.uaj.dao.IUserDao.deleteUser",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public User findById(int id) {
        SqlSession sqlSession = factory.openSession();
        User user = sqlSession.selectOne("cn.uaj.dao.IUserDao.findById", id);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> findLike(String string) {
        SqlSession sqlSession = factory.openSession();
        List<User> users = sqlSession.selectList("cn.uaj.dao.IUserDao.findLike", string);
        sqlSession.close();
        return users;
    }

    @Override
    public int totalCount() {
        SqlSession sqlSession = factory.openSession();
        Integer num = sqlSession.selectOne("cn.uaj.dao.IUserDao.totalCount");
        sqlSession.close();
        return num;
    }
}
