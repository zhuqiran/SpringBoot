package com.csust.springboot.service;

import com.csust.springboot.entitys.Student;

public interface IStudentService {
    boolean updateById(Student student) throws Exception;
}
