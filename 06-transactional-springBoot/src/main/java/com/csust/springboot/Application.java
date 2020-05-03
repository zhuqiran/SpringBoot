package com.csust.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement            // 在SpringBoot中开启对事务的支持
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
