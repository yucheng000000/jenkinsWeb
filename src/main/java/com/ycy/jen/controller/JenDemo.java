package com.ycy.jen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jendemo")
public class JenDemo {

    @RequestMapping("/print")
    public String print(){
        String str = "Hello World000000!";
        System.out.println(str);
        return str;
    }
}
