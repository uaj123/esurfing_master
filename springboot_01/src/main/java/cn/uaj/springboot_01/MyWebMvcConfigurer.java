package cn.uaj.springboot_01;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: wushaojie
 * @Date: 2020/3/18 20:47
 * 该类相当于原来的springMvc.xml
 * 现在是一个springMvc配置类
 */
@Configuration // 标志当前类在启动时自动加载
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    /*注册配置拦截器*/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /*添加自定义拦截器，配置拦截路径，忽略路径，依次配置*/
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").
                excludePathPatterns("/query")
                .excludePathPatterns("/login","/","/index.html","/user/login")
                .excludePathPatterns("/bootstrap","/jquery/**","/login/**"); // 登录相关，静态资源
    }

    /**
     * 配置时间转换器
     * @param registry
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new MyDateFormat());
    }
}
