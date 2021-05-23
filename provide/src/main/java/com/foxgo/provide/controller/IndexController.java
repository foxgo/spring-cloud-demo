package com.foxgo.provide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: foxgo
 * @date: 2021/5/23 10:32
 * @since 1.0
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }
}
