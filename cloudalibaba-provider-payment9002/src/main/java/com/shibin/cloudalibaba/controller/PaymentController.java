package com.shibin.cloudalibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-10 15:36
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/get/{id}")
    public String get(@PathVariable Integer id){
        return "payment nacos serverPort:" + serverPort + "###" + "id:" +id;
    }
}
