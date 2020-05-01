package com.csust.springboot.mapper;

import com.csust.springboot.entitys.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student student);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Student student);
}
