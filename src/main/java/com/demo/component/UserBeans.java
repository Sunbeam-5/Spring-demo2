package com.demo.component;

import com.demo.module.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * author：张三
 */

@Component
public class UserBeans {

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    //@Scope("prototype")
    @Bean
    public User user1() {
        User user = new User();
        user.setId(5);
        user.setName("张三");
        user.setPassword("123456789");
        return user;
    }
}
