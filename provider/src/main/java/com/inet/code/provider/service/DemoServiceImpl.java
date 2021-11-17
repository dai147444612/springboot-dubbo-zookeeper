package com.inet.code.provider.service;

import com.inet.code.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
