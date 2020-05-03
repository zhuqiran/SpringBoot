package com.csust.springboot.controller;

import com.csust.springboot.entitys.Student;
import com.csust.springboot.service.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource
    private IStudentService studentService;

    @GetMapping(value = "/boot/update")
    public String update(){
        Student student = new Student();
        student.setId(1);
        student.setName("张三");
        student.setAge(24);
        student.setScore(94);
        boolean flag = false;
        try{
            flag = studentService.updateById(student);
        }catch (Exception ex){
            // 更新出现异常
        }

        return flag ? "用户信息更新成功！" : "用户信息更新失败！";
    }
}
