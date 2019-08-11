package com.lw.example.demo.controller;

import com.lw.example.demo.config.BookComponet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wander
 * @version 1.0
 * @date 2019/8/11-14:08
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookComponet book;

    @RequestMapping("/one")
    public String getBookWithProperties() {
        return book.toString();
    }
}
