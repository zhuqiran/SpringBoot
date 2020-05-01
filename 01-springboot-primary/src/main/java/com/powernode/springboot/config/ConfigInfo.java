package com.powernode.springboot.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 核心配置文件的第二种读取方式，以对象的形式读取
 */

@Component(value = "configInfo")
@ConfigurationProperties(prefix = "self")
public class ConfigInfo {
    private String name;

    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
