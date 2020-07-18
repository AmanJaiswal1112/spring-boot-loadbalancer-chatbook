package com.javatechie.springboot.loadbalancer.chatbook.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootLoadbalancerChatbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLoadbalancerChatbookApplication.class, args);
    }


}
