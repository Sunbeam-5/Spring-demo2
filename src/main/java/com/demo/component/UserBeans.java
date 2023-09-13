package com.demo.component;

import com.demo.module.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserBeans {

    @Bean
    public User user() {
        User user = new User();
        user.setId(5);
        user.setName("zhangsan");
        user.setPassword("123456789");
        return null;
    }
}
