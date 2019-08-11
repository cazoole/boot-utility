package com.lw.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wander
 * @version 1.0
 * @date 2019/8/11-13:48
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello ".concat(name).concat("，welcome to spring-boot2");
    }
}
