package com.alibaba.dubbo.client.controller;

import com.alibaba.dubbo.api.TestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @Reference // dubbo注入接口 从nacos注册中心获取服务器地址
    private TestService testService;

    @GetMapping("/test")
    public String test(String name) {
        return testService.test(name);
    }
}
