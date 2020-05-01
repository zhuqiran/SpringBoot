package com.csust.springboot.controller;

import com.csust.springboot.entitys.Student;
import com.csust.springboot.services.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MybatisController {

    @Resource
    private IStudentService studentService;

    @GetMapping(value = "/boot/student")
    public Student getStudent(){
        Student student = studentService.getStudentById(1);
        return student;
    }
}
