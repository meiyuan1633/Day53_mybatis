package com.wei.service;

import com.wei.entity.Student;

import java.util.List;

public interface IStudentService {
    Integer addStudent(Student student);
    Integer add(Student student);
    List<Student>findAll();
    Student findById(Integer id);
    Integer update(Student student);
    Integer delete(Integer id);
}
