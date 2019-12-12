package com.alibaba.nacos.discovery.client.webclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class WebFluxController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/testWebFlux")
    public Mono<String> testWebFlux() {
        Mono<String> result = webClientBuilder.build().get()
                .uri("http://alibaba-nacos-discovery-server/test?name=webFlux")
                .retrieve().bodyToMono(String.class);
        return result;
    }
}
