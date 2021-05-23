package com.foxgo.provide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: foxgo
 * @date: 2021/5/23 12:22
 * @since 1.0
 */
@RestController
@RequestMapping("/api/person")
public class PersonController {

    @GetMapping("/{id}")
    public Long getPerson(@PathVariable("id") Long id) {
        return id;
    }
}
