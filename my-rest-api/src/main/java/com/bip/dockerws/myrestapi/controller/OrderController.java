package com.bip.dockerws.myrestapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@Slf4j
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Value("${api.version}")
    private String version;

    @RequestMapping("/test")
    public String test() {

        log.info("/api/order/test is called..");
        return MessageFormat.format("Order Api {0} is UP", version);
    }
}
