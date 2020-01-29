package com.alibaba.sentinel.dubbo.client;

import com.alibaba.csp.sentinel.slots.block.SentinelRpcException;
import com.alibaba.sentinel.dubbo.api.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Lion Li
 */
@EnableDiscoveryClient  // 开启注册中心客户端
@SpringBootApplication
public class SentinelDubboClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(SentinelDubboClientApplication.class, args);
	}
}
