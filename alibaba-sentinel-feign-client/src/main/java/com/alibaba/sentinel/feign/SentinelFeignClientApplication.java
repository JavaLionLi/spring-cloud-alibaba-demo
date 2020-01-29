package com.alibaba.sentinel.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Lion Li
 */
@EnableFeignClients // 启动Feign客户端
@SpringCloudApplication
public class SentinelFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentinelFeignClientApplication.class, args);
	}

}
