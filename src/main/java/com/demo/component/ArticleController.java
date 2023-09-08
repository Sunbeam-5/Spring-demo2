package com.demo.component;

import org.springframework.stereotype.Controller;

@Controller
public class ArticleController {
    public String sayHello(){
        return "Hello Controller";
    }
}
