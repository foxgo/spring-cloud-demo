package com.foxgo.consume.controller;

import com.foxgo.consume.feign.PersonClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: foxgo
 * @date: 2021/5/23 10:39
 * @since 1.0
 */
@RestController
@RequestMapping("/person")
@AllArgsConstructor
public class IndexController {

    private PersonClient client;

    @GetMapping("{id}")
    public Long getPerson(@PathVariable("id") Long id) {
        return client.getPerson(id);
    }

}
