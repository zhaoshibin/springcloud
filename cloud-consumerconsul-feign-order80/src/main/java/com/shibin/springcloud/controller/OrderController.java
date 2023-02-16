package com.shibin.springcloud.controller;

import com.shibin.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-08 11:05
 */
@RestController
@RequestMapping("/feignOrder")
public class OrderController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/payment/consul")
    public String paymentConsul(){
        return paymentService.paymentConsul();
    }

    @RequestMapping("/payment/testTimeOut")
    public String testTimeOut(){
        return paymentService.testTimeOut();
    }

}
