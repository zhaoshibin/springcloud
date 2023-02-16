package com.shibin.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("consul-provider-payment")
public interface PaymentService {

    @RequestMapping("/payment/consul")
    public String paymentConsul();

    @RequestMapping("/payment/testTimeOut")
    String testTimeOut();
}
