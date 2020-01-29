package com.alibaba.sentinel.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Lion Li
 */
@EnableDiscoveryClient // 启动Feign客户端
@SpringBootApplication
public class SentinelFeignServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentinelFeignServerApplication.class, args);
	}

}
