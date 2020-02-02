package com.alibaba.stream.rocketmq.controller;

import com.alibaba.stream.rocketmq.messaging.TestMessaging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Lion Li
 */
@RestController
public class TestController {

    @Autowired
    private Source source;

    @GetMapping("/stream-test-msg")
    public String streamTestMsg(String msg){
        // 构建消息对象
        TestMessaging testMessaging = new TestMessaging()
                .setMsgId(UUID.randomUUID().toString())
                .setMsgText(msg);
        source.output().send(
                MessageBuilder.withPayload(testMessaging).build());
        return "投递消息 => " + msg + " => 成功";
    }
}
