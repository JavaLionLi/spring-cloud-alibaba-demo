package com.alibaba.nacos.discovery.client.restTemplate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class RestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/testRest")
    public String test() {
        String result = restTemplate.getForObject("http://alibaba-nacos-discovery-server/test?name=restTemplate", String.class);
        return "返回数据 : " + result;
    }
}
