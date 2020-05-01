package com.powernode.springboot.springMVCController;

import org.springframework.web.bind.annotation.*;

@RestController
public class ThirdController {

    @RequestMapping(value = "/boot/getMessage", method = RequestMethod.POST)
    public String getMessage1(){
        return "requestMapping + post";
    }

    @PostMapping(value = "/boot/getMessage2")
    public String getMessage2(){
        return "PostMapping = RequestMapping + method = RequestMethod.POST";
    }

    @GetMapping(value = "/error")
    public String returnError(){
        return "一不小心，出错了！";
    }
}
