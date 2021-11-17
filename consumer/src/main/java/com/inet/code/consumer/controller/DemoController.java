package com.inet.code.consumer.controller;

import com.inet.code.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @DubboReference(version = "1.0.0")
    DemoService demoService;

    @GetMapping("getHello")
    public String sayHello(){
        return demoService.sayHello("你好分布式");
    }
}
