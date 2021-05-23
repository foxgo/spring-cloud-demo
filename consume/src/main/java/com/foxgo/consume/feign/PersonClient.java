package com.foxgo.consume.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: foxgo
 * @date: 2021/5/23 10:40
 * @since 1.0
 */
@FeignClient(name = "provide", fallback = PersonClientFallback.class)
public interface PersonClient {

    /**
     * @param id
     * @return
     */
    @GetMapping("/api/person/{id}")
    Long getPerson(@PathVariable("id") Long id);
}
