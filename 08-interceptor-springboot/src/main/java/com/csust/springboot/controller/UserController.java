package com.csust.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/boot")
public class UserController {

    /**
     * boot/index
     */
    @GetMapping(value = "/index")
    public Object index(){
        return "欢迎访问，网站你主页！";
    }

    /**
     * boot/login
     */
    @GetMapping(value = "/login")
    public Object login(){
        return "欢迎登录";
    }

    /**
     * boot/logout
     */
    @GetMapping(value = "/logout")
    public Object logout(){
        return "成功推出系统！";
    }
}
