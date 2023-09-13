package com.demo.controller;

import com.demo.component.UserComponent;
import com.demo.module.Student;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class StudentController {

//    //1.使用属性注入的方式获取Bean
//    @Autowired
//    private StudentService studentService;

//    //2.set注入
//    private StudentService studentService;
//
//    @Autowired
//    public void setStudentService(StudentService studentService) {
//        this.studentService = studentService;
//    }

    /*//3.构造方法注入，优点：可以加final，解决了set的缺点
    private final StudentService studentService;
    private UserComponent userComponent;

    //只有一个构造方法可以不用Autowired，多个不行
    @Autowired
    //不能使用@Resource
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //两个就不行了
    public StudentController(StudentService studentService,
                             UserComponent userComponent) {
        this.studentService = studentService;
        this.userComponent = userComponent;
    }

    public void sayHi() {
        // 调用service方法
        studentService.sayHi();
    }*/


    //@Resource(name = "student2") //@Autowired和单独@Resource效果一样，会报错。可以使用@Autowired和@Qualifier
    @Autowired
    @Qualifier("student2")
    private Student student;

    public void sayHi() {
        System.out.println(student.toString());
    }
}
