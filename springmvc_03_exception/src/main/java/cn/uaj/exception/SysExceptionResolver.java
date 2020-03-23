package cn.uaj.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: wushaojie
 * @Date: 2020/2/8 15:51
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

    /**
     * 处理异常业务逻辑
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        /*获取到异常对象*/
        SysException ex = null;
        if (e instanceof SysException) {
            ex = (SysException) e;
        }else {
            ex = new SysException("系统正在维护中...");
        }
        /*创建modelAndView对象*/
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errorMsg",ex.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
