package com.csust.springboot.interceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 定义一个拦截器
 *  1. 实现HandlerInterceptor接口
 *  2. 实现HandlerInterceptor接口的boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)方法
 */

public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 该方法在被拦截请求之前执行。
     * 登录拦截器
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入到了登录拦截器中........");

        /*
            需要注意的是，该方法的返回值为false时，表示此次请求未成功通过拦截器。即访问的目标方法，不会执行
                            返回true时，表示请求成功通过拦截器，进入到请求的目标方法
         */
        return true;
    }
}
