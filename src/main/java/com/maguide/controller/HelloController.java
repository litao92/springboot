package com.maguide.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

@Controller
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        System.out.print("小明的修改");
        return "abcdefghhhhhh";
    }

    public static void main(String[] arge){
        SpringApplication.run(HelloController.class,arge);
    }

}
