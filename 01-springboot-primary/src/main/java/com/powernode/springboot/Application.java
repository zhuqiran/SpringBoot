package com.powernode.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// 注解的方式标记这是一个springboot的应用程序
@SpringBootApplication      //该注解是SpringBoot项目的核心注解，主要作用是开启SpringBoot自动配置。
public class Application {
    // springboot应用程序的main方法
    public static void main(String[] args) {
        // 启动springboot应用程序，创建spring容器，启动springboot中内嵌的tomcat服务器
        SpringApplication.run(Application.class, args);
    }

}
