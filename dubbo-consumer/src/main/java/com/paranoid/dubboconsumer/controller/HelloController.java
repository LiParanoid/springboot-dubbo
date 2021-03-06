package com.paranoid.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.paranoid.dubbointerface.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    HelloService helloService;
    @RequestMapping("/hello")
    public String hello(){
        String hello = helloService.sayHello(" world");
        System.out.println(helloService.sayHello(" LiParanoid"));
        return hello;
    }
}
