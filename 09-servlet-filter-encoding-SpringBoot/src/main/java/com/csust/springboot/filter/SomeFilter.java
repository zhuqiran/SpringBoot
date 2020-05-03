package com.csust.springboot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


/**
 * 通过注解的方式，实现在SpringBoot中使用filter
 *  注解：@WebFilter
 */

@WebFilter(filterName = "someFilter", urlPatterns = "/*")
public class SomeFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入到了SomeFilter过滤器中！");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
