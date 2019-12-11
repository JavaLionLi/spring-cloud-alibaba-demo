package com.alibaba.nacos.config.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RefreshScope // nacos 配置自动刷新
public class TestController {
    // 从 nacos 获取端口号
    @Value("${server.port:}")
    private String port;

    @GetMapping("/test")
    public String test() {
        return "端口:"+port;
    }

}
