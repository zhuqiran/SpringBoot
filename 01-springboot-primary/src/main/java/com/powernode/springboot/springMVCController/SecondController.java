package com.powernode.springboot.springMVCController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @GetMapping = @RequestMapping(value="", method=RequestMethod.GET)
 *
 * 即，使用该注解即表示当前方法只处理get请求。与之对应的还有一个PostMapping.
 */

@Controller
public class SecondController {

    // 该方法只处理get请求
    @RequestMapping(value = "/boot/getMsg1", method = RequestMethod.GET)
    public @ResponseBody String getMsg1(){
        return "requestMapping + method";
    }

    @GetMapping("/boot/getMsg2")
    public @ResponseBody String getMsg2(){
        return "GetMapping = RequestMapping + method = get";
    }
}
