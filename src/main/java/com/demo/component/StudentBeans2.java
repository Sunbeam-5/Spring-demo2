package com.demo.component;

import com.demo.module.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StudentBeans2 {
    @Bean(name = {"s3"})
    public Student student() {
        Student stu = new Student();
        stu.setId(1);
        stu.setAge(20);
        stu.setName("李四");
        return stu;
    }
}
