package com.alibaba.nacos.discovery.client.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class FeignController {

    @Autowired
    private TestServiceFeign client;

    @GetMapping("/testFeign")
    public String test() {
        String result = client.hello("feign");
        return "返回数据 : " + result;
    }
}
