package com.csust.springboot.controller;

import com.csust.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {

    @GetMapping(value = "/boot/index")
    public Object index(Model model){
        model.addAttribute("msg", "SpringBooot集成Thymeleaf！");

        return "index";
    }

    @GetMapping(value = "/boot/user")
    public Object userInfo(Model model){
        User user = new User();
        user.setId(1);
        user.setNick("王五的春天");
        user.setPhone("1273912319273912");
        user.setAddress("北京大兴");
        model.addAttribute("user", user);
        return "user";
    }


    @GetMapping(value = "/boot/property")
    public Object property(Model model){
        User user = new User();
        user.setId(112);
        user.setNick("李四");
        user.setPhone("123797979");
        user.setAddress("河南郑州");
        model.addAttribute("user", user);

        List<User> userList = new ArrayList<>();
        for(int i=0; i<3; i++){
            User u = new User();
            u.setId(112);
            u.setNick("李四 " + i);
            u.setPhone("123797979 " + i);
            u.setAddress("河南郑州 " + i);
            userList.add(u);
        }
        model.addAttribute("userList", userList);

        Map<Integer, Object> map = new HashMap<>();
        for(int i=0; i<3; i++){
            User u = new User();
            u.setId(112);
            u.setNick("李四 " + i);
            u.setPhone("123797979 " + i);
            u.setAddress("河南郑州 " + i);
            map.put(i, u);
        }
        model.addAttribute("map", map);
        model.addAttribute("sex", 1);
        return "property";
    }
}
