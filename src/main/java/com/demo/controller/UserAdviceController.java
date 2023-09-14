package com.demo.controller;

import com.demo.module.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * author:王五
 */

@Controller
public class UserAdviceController {

    @Autowired
    private User user1;

    public void getUser() {
        System.out.println("王五 | user1" + user1);
    }

}
