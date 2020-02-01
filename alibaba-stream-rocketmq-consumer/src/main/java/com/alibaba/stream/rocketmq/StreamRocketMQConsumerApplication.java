package com.alibaba.stream.rocketmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author Lion Li
 */
@SpringBootApplication
@EnableBinding(Sink.class)
public class StreamRocketMQConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamRocketMQConsumerApplication.class, args);
	}

}
