package com.wei.controller;

import com.wei.entity.Student;
import com.wei.service.impl.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/StudentController")

public class StudentController {
    @Resource
    private StudentServiceImpl studentService;

    @RequestMapping(value = "/addStudent",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String addStudent(){
        Student student1 = new Student();
        student1.setUsername("zs");
        student1.setPassword("1230");
        Integer integer = studentService.addStudent(student1);
        return "添加成功";
    }

    @RequestMapping(value = "/add",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String add(){
        Student student = new Student();
        student.setUsername("美媛");
        student.setPassword("123");
        Integer add = studentService.add(student);
        System.out.println(add);
        return "添加成功";
    }
    @RequestMapping(value = "/update",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String update(){
        Integer update = studentService.update(new Student(5, "w5", "123"));
        System.out.println(update);
        return "修改成功";
    }
    @RequestMapping(value = "/delete",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String  delete(){
        Integer delete = studentService.delete(8);
        System.out.println(delete);
        return "删除成功";
    }

    @RequestMapping(value = "/findById",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String findById(){
        Student stu = studentService.findById(4);
        System.out.println(stu);
        return "查询成功";
    }
    @RequestMapping(value = "/findAll",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String findAll(){
        List<Student> all = studentService.findAll();
        System.out.println(all);
        return "查询成功";
    }
}
