package com.csust.springboot.mapper;

import com.csust.springboot.entitys.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStudentDao {
    // 跟新数据
    int updateByPrimaryKey(Student student);
}
