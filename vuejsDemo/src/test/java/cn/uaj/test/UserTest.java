package cn.uaj.test;

import cn.uaj.entity.User;
import cn.uaj.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/3/19 20:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    private IUserService userService;


    @Test
    public void testFindAll(){
        List<User> users = userService.findAll();
        System.out.println(users);
    }

    @Test
    public void testFindOne(){
        User user = userService.findById(1);
        System.out.println(user);
    }

    @Test
    public void testUpdate(){
        User user = userService.findById(1);
        System.out.println("修改之前的用户"+user);

        user.setAge(55);
        userService.updateUser(user);

        user = userService.findById(1);
        System.out.println("修改之后的用户"+user);
    }
}
