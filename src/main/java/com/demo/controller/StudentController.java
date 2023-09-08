package com.demo.controller;

import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

//    //使用属性注入的方式获取Bean
//    @Autowired
//    private StudentService studentService;

    //set注入
    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void sayHi() {
        // 调用service方法
        studentService.sayHi();
    }
}
