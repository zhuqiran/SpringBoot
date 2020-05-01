package com.powernode.springboot.springMVCController;



import com.powernode.springboot.entity.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController注解演示；
 *  @RestController = @Controller + @Response
 *
 * 不过需要注意的是，在此Controller中，只能返回@Response不能够返回界面
 */

@RestController     // @RestController = @Controller + @Response
public class FirstController {
    @RequestMapping("/boot/getMsg")
    public String getMsg(){
        return "restController";
    }


    // 如果返回值是一个对象，则返回json数组
    @RequestMapping("/boot/getUser")
    public Object getUser(){
        UserInfo userInfo = new UserInfo();
        userInfo.setId("123123123");
        userInfo.setName("张三");
        return userInfo;
    }
}
