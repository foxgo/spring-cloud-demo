package com.foxgo.consume.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: foxgo
 * @date: 2021/5/23 13:24
 * @since 1.0
 */
@Component
public class PersonClientFallback implements PersonClient {

    @Override
    public Long getPerson(Long id) {
        return Long.valueOf(0);
    }
}
