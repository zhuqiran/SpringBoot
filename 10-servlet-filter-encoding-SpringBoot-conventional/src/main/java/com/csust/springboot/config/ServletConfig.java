package com.csust.springboot.config;

import com.csust.springboot.filter.SomeFilter;
import com.csust.springboot.servlet.SomeServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * 配置类
 *
 * 在配置类中完成对Servlet的配置
 *
 * 在配置中完成对Filter的配置
 */
@Configuration
public class ServletConfig {

    // 完成对Servlet的配置
    @Bean
    public ServletRegistrationBean<SomeServlet> someServletServletRegistrationBean(){
        ServletRegistrationBean<SomeServlet> servletRegistrationBean = new ServletRegistrationBean<>(new SomeServlet(), "/someServlet");
        return servletRegistrationBean;
    }

    // 完成对Filter的配置
    @Bean
    public FilterRegistrationBean<SomeFilter> filterFilterRegistrationBean(){
        FilterRegistrationBean<SomeFilter> filterRegistrationBean = new FilterRegistrationBean<>(new SomeFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    // 配置字符编码过滤器，解决项目请求中的中文乱码问题
    @Bean
    public FilterRegistrationBean<CharacterEncodingFilter> filterRegistration(){
        FilterRegistrationBean<CharacterEncodingFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("GBK");
        encodingFilter.setForceEncoding(true);
        filterFilterRegistrationBean.setFilter(encodingFilter);
        filterFilterRegistrationBean.addUrlPatterns("/*");
        return filterFilterRegistrationBean;
    }

}
