package com.client.springcloudclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: jlsong E-mail: songjilei1988@126.com
 * @Date: Created in 下午10:21 18-4-23
 */

@RestController
public class ApiController {
    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }

}
