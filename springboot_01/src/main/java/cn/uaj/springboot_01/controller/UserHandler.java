package cn.uaj.springboot_01.controller;

import cn.uaj.springboot_01.entity.User;
import cn.uaj.springboot_01.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wushaojie
 * @Date: 2020/3/18 22:42
 *
 * 在springMvc中controller层类上的要使用@Controller来注明该类属于控制层，在controller层常返回的数据形式有以下几种：
 *
 * 　　页面：静态页面
 *
 * 　　ModelAndView：返回页面和相应数据
 *
 * 　　json字符串：如果某个类设计初衷就是返回json字符串，
 *          那么该类就可以使用@Controller + @ResponseBody，
 *          还可以使@RestCotroller简化书写
 */
@RestController // 使用RestController修饰类，最后返回结果都会被解析成json字符串，适合所有的方法返回值都是json数据
public class UserHandler {
    private Logger l = LoggerFactory.getLogger(UserHandler.class);
    //debug.info,warn,error
    @Resource
    private UserService userService;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    private final String userKey = "suser:";

    @GetMapping("/query")
    public User query(Integer id){
        User user = null;
        String Key = userKey + id;
        // 先查询缓存,实体类需要空参构造方法，否则会报反序列化异常
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        Object o = valueOperations.get(Key);
        // 如果缓存中有
        if (o!=null){
            System.out.println("--------------------------");
            user = (User) o;
        }else {
            // 缓存中没有查数据
            user = userService.selectUser(id);
            System.out.println("dddddddddddddddddddddd");
            // 将查询的数据存入redis
            valueOperations.set(Key,user);
        }
        return user;

    }
    @GetMapping("/findUserPageInfo")
    public PageInfo<User> findUserPageInfo(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "2") Integer pagSize){
        PageHelper.startPage(pageNum,pagSize);
        List<User> userList = userService.selectUsers();
        PageInfo<User> list = new PageInfo<>(userList);
        return list;
    }
}
