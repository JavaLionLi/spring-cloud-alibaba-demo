package com.alibaba.sentinel.feign.controller;

import com.alibaba.sentinel.feign.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lion Li
 */
@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping("/test")
	public String test(@RequestParam("name") String name) {
		return testService.test(name);
	}

}
