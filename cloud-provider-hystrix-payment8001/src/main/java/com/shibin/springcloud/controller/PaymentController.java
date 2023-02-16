package com.shibin.springcloud.controller;

import com.shibin.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-08 14:21
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable Integer id){
        String result = paymentService.paymentInfo_OK(id);
        return result;
    }

    @RequestMapping("/hystrix/timeOut/{id}")
    public String paymentInfo_timeOut(@PathVariable Integer id){
        String result = paymentService.paymentInfo_timeOut(id);
        return result;
    }
}
