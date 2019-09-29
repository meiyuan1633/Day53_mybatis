package com.wei.service.impl;

import com.wei.entity.Student;
import com.wei.mapper.IStudentMapper;
import com.wei.service.IStudentService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
    @Resource
   IStudentMapper iStudentMapper;
    @Override
    public Integer addStudent(Student student) {
        Student student1 = new Student();
        student1.setUsername("zs");
        student1.setPassword("1230");
        Integer s2 = iStudentMapper.addStudent(student1);
        System.out.println("id:"+student1.getId());
        return s2;
    }

    @Override
    public Integer add(Student student) {
        System.out.println(student);
        Integer add = iStudentMapper.add(student);

        return add;
    }

    @Override
    public List<Student> findAll() {
        List<Student> all = iStudentMapper.findAll();
        return all;
    }

    @Override
    public Student findById(Integer id) {
        Student byId = iStudentMapper.findById(id);
        return byId;
    }


    @Override
    public Integer update(Student student) {
        Integer update = iStudentMapper.update(student);
        return update;
    }

    @Override
    public Integer delete(Integer id) {
        Integer delete = iStudentMapper.delete(id);
        return delete;
    }
}
