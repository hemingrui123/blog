package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * Describe: 错误页面跳转
 */
@Controller
public class ErrorPageControl {

    @GetMapping("/404")
    public String error404(){
        return "404";
    }

    @GetMapping("/403")
    public String error403(){
        return "403";
    }

}
