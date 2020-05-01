package com.csust.springboot.services;

import com.csust.springboot.entitys.Student;
import com.csust.springboot.mapper.IStudentMapper;

public interface IStudentService {
    Student getStudentById(Integer id);
}
