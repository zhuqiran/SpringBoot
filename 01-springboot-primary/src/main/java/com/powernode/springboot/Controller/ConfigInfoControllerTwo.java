package com.powernode.springboot.Controller;

import com.powernode.springboot.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 读取核心配置文件的第二种方式
 */
@Controller
public class ConfigInfoControllerTwo {
    // 对域属性对象进行注入
    @Resource(name = "configInfo")
    private ConfigInfo configInfo;

    @RequestMapping(value = "/boot/getConfigInfo")
    public @ResponseBody String getConfigInfo(){
        return configInfo.getName() + "----" + configInfo.getLocation();
    }
}
