package com.lw.example.demo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wander
 * @version 1.0
 * @date 2019/8/11-13:51
 */
@Controller
@RequestMapping
public class HelloPageController {

    @RequestMapping("/index")
    public Object index() {
        return "index";
    }

    @RequestMapping("/index/{name}")
    @ResponseBody
    public Object sayHelloWithPage(@PathVariable String name) {
        return name;
    }
}
