package com.paranoid.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.paranoid.dubbointerface.service.HelloService;
import org.springframework.stereotype.Component;

@Component
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
