package com.demo.component;

import com.demo.module.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StudentBeans {
    //伪代码，构建对象
    @Bean//(name = {"s1","s2"})
    public Student student1() {
        Student stu = new Student();
        stu.setId(1);
        stu.setAge(20);
        stu.setName("张三");
        return stu;
    }

    @Bean
    public Student student2() {
        Student stu = new Student();
        stu.setId(2);
        stu.setAge(20);
        stu.setName("慕九");
        return stu;
    }
}
