package com.alibaba.nacos.discovery.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "alibaba-nacos-discovery-server")
public interface TestServiceFeign {

    @GetMapping("/test")
    String test(@RequestParam(name = "name") String name);

}
