package cn.ping.securityhello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: security
 * @ClassName HelloController
 * @description:
 * @author: wanbaoping
 * @create: 2021-09-19 00:00
 * @Version 1.0
 **/
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "hello ";
    }
}
