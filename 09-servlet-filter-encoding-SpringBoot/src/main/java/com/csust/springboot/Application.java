package com.csust.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = {"com.csust.springboot.servlet", "com.csust.springboot.filter"})
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
