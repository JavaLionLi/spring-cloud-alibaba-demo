package com.alibaba.dubbo.server.service;

import com.alibaba.dubbo.api.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 测试接口实现
 */
@Service // 这里使用的是dubbo的 @Service 注解 将注册到注册中心
public class TestServiceImpl implements TestService {

    @Override
    public String test(String name) {
        return "服务器2::返回值 => " + name;
    }

}