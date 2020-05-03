package com.csust.springboot.service;

import com.csust.springboot.entitys.Student;
import com.csust.springboot.mapper.IStudentDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements IStudentService {
    @Resource
    private IStudentDao studentDao;

    @Override
    @Transactional          // 定义事务
    public boolean updateById(Student student) throws Exception{
        boolean flag = false;
        int count = studentDao.updateByPrimaryKey(student);
        flag = count > 0;
        try{
            double res = 10 / 2;
        }catch (Exception ex){
            throw ex;
        }
        return flag;
    }
}
