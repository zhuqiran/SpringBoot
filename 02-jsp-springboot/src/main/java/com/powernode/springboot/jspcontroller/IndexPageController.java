package com.powernode.springboot.jspcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

    @GetMapping("/boot/index")
    public String indexPage(Model model){
        model.addAttribute("msg", "jsp in springboot");
        return "indexPage";
    }
}
