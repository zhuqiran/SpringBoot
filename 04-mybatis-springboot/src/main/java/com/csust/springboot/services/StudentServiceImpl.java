package com.csust.springboot.services;

import com.csust.springboot.entitys.Student;
import com.csust.springboot.mapper.IStudentMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements IStudentService {

    @Resource
    private IStudentMapper studentMapper;

    @Override
    public Student getStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }
}
