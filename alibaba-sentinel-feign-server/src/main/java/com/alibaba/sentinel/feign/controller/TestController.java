package com.alibaba.sentinel.feign.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author Lion Li
 */
@RestController
public class TestController {

	@PostMapping("/test")
	public String test(@RequestParam("name") String name) {
		return "服务提供端::返回值 => " + name;
	}

}
