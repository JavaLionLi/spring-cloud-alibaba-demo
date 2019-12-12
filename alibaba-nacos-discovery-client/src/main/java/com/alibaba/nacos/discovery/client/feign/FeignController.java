package com.alibaba.nacos.discovery.client.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class FeignController {

    @Autowired
    private TestServiceFeign testServiceFeign;

    @GetMapping("/testFeign")
    public String testFeign() {
        String result = testServiceFeign.test("feign");
        return "返回数据 : " + result;
    }
}
