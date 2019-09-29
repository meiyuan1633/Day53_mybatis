package com.wei.mapper;

import com.wei.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IStudentMapper {
    //添加，返回的是id
    Integer addStudent(@Param("stu") Student student);

    //添加
    Integer add(@Param("stu1") Student student);
    //查询
    List<Student>findAll();
    //单条查询
    Student findById(@Param("id2") Integer id);
    //修改
    Integer update(@Param("stu2")Student student);
    //删除
    Integer delete(@Param("id1")Integer id);
}
