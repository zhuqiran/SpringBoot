package com.csust.springboot.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器配置类
 *  1. 继承WebMvcConfigurerAdapter
 *  2. 在该配置类上添加Configuration注解，标注该类为一个配置类，在加载时，SpringBoot会扫描到
 *  3. 重写父类WebMvcConfigurerAdapter的addInterceptors方法，进行拦截器的注册和拦截路径，不拦截路径的配置
 */
@Configuration
public class LoginInterceptorConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器，参数是拦截器的实例化对象
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new LoginInterceptor());


        // 配置拦截的资源路径
        // 拦截/boot请求路径下的所有请求
        String[] pathPatterns = {
                "/boot/*"
        };
        interceptorRegistration.addPathPatterns(pathPatterns);
        // 配置不拦截的资源路径
        // 不拦截/boot/index请求
        String[] excludePathPatterns = {
                "/boot/index"
        };
        interceptorRegistration.excludePathPatterns(excludePathPatterns);
    }
}
