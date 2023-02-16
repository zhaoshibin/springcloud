package com.shibin.springcloud.controller;

import com.shibin.springcloud.entity.CommonResult;
import com.shibin.springcloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-02 13:54
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    String paymentUrl = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){

        return restTemplate.getForObject(paymentUrl + "/payment/getPaymentById/" + id, CommonResult.class);

    }

    @RequestMapping("/payment/add")
    public CommonResult getPaymentById(Payment payment){

        return restTemplate.postForObject(paymentUrl + "/payment/add", payment, CommonResult.class);
    }

}
