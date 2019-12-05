package com.alibaba.nacos.discovery.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/test")
    public String hello(@RequestParam String name) {
        log.info("调用 name => " + name);
        return "参数 => " + name;
    }

}
