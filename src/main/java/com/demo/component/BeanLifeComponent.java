package com.demo.component;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class BeanLifeComponent implements BeanNameAware {


    @Override
    public void setBeanName(String s) {
        System.out.println("执行了通知");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("执行了@PostConstruct方法");
    }

    public void init() {
        System.out.println("执行了init方法");
    }

    @PreDestroy
    public void preDestroy () {
        System.out.println("销毁之前执行了销毁方法");
    }
}
