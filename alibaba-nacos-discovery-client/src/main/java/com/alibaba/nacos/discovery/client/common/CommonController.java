package com.alibaba.nacos.discovery.client.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class CommonController {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/testCommon")
    public String testCommon() {
        // 通过spring cloud common中的负载均衡接口选取服务提供节点实现接口调用
        ServiceInstance serviceInstance = loadBalancerClient.choose("alibaba-nacos-discovery-server");
        String url = serviceInstance.getUri() + "/test?name=common";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(url, String.class);
        return "返回数据 : " + result;
    }
}
