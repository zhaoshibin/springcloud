package com.shibin.cloudalibaba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-10 16:19
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String serverPort;

    @Value("${service-url.nacos-payment-service}")
    private String paymentUrl;

    @RequestMapping("/payment/get/{id}")
    public String get(@PathVariable Integer id){
        return restTemplate.getForObject(paymentUrl + "/payment/get/" + id, String.class);
    }
}
