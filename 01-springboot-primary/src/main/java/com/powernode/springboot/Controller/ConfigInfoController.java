package com.powernode.springboot.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigInfoController {
    // 读取配置文件中指定键的值
    @Value("${self.name}")
    private String name;
    @Value("${self.location}")
    private String location;

    @RequestMapping("/boot/configInfo")
    public @ResponseBody String readyConfig(){
        return name + "--" + location;
    }
}
