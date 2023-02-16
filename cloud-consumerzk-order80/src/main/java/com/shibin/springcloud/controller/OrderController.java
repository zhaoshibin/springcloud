package com.shibin.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-03 16:08
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

    public static final String PAYMENT_URL = "http://cloud-payment-service";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/payment/zk")
    public String consumerOrder(){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
    }

}
