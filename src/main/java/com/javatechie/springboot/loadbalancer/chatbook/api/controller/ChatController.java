package com.javatechie.springboot.loadbalancer.chatbook.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

@RestController
@RequestMapping("/chatbook-application")
public class ChatController
{
    @Value("${server.port}")
    private String port;

    @GetMapping("/chat")
    public String chatNow()
    {
        return "Application running on port ="+port;
    }

}
