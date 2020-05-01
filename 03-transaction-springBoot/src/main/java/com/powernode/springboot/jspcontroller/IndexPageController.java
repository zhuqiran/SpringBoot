package com.powernode.springboot.jspcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

    @GetMapping(value = "/boot/indexPage")
    public String accIndexPage(Model model){
        model.addAttribute("msg", "welcome to index page!");
        return "index";
    }
}
