package cn.uaj.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器类，必须是实现HandlerInterceptor接口
 * @Author: wushaojie
 * @Date: 2020/2/8 20:45
 */
public class MyInterceptor implements HandlerInterceptor {
    /**
     * preHandle   表示预处理
     * @param request
     * @param response
     * @param handler
     * @return true 表示放行执行下一个拦截器或执行controller中方法 ,false 表示不放行
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("myInterceptor拦截器执行...");
        return true;

        /*
        // 不放行，可以跳转到想要的页面
        request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
        return false;
        */
    }

    /**
     * 后处理方法，controller方法执行后，success.jsp执行之前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle拦截器执行...");
        // 可以跳转到想要的页面
        // request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
    }

    /**
     * 最后执行方法，可以用来做资源的释放
     * success.jsp执行之后执行afterCompletion
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion拦截器执行...");
    }
}
