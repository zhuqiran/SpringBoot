package com.csust.springboot.controller;

import com.csust.springboot.entitys.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/boot")
public class IndexController {

    /**
     * 借助@PathVariable注解，实现RESTFull风格的访问接口
     *
     * 原访问接口
     *https://localhost/boot/user?id=1&name=zangsan
     * RESTFull风格的访问接口
     * https://localhost/boot/user/1/zangsan
     *
     */
    @GetMapping(value = "/user/{id}/{name}")
    public Object user(@PathVariable(value = "id") Integer id, @PathVariable(value = "name") String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return student;
    }

  /*

    下面这种情况，虽然你参数类型不一样，方法可以满足重载条件；但是参数个数一样，对于RESTFull来讲，是模糊的，RESTFull无法判断请求的是各一个处理方法。

    @GetMapping(value = "/user/{id}/{age}")
    public Object user(@PathVariable(value = "id") Integer id, @PathVariable(value = "age") Integer age){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }
*/
}
