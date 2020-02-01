package com.alibaba.stream.rocketmq.listener;

import com.alibaba.stream.rocketmq.messaging.TestMessaging;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.ErrorMessage;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestStreamConsumer {

    @StreamListener(Sink.INPUT)
    public void receive(TestMessaging testMessaging){
        log.warn("通过stream消费到消息 => {}",testMessaging.toString());
//        if (testMessaging.getMsgText().equals("测试异常")){
//            throw new RuntimeException("测试全局异常拦截");
//        }
    }

    /**
     * 全局异常处理
     */
    @StreamListener("errorChannel")
    public void error(Message<?> message){
        ErrorMessage errorMessage = (ErrorMessage) message;
        log.error("发生异常 => {}",errorMessage);
    }

}
