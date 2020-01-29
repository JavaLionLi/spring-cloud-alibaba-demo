/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.sentinel.dubbo.server.service;

import com.alibaba.sentinel.dubbo.api.TestService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author Lion Li
 */
@Service // 这里使用的是dubbo的 @Service 注解 将注册到注册中心
@RefreshScope // nacos 配置自动刷新
public class TestServiceImpl implements TestService {

	@Value("${server.port:}")
	private String port;

	@Override
	public String test(String name) {
		return "服务器::端口:"+port+"::返回值 => " + name;
	}

}
