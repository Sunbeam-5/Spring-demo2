package com.demo.component;

import org.springframework.stereotype.Component;

@Component
public class UserComponent {
    public String sayHi() {
        return "Hi,@Component";
    }
}
