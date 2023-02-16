package com.shibin.springcloud.controller;

import com.shibin.springcloud.entity.CommonResult;
import com.shibin.springcloud.entity.Payment;
import com.shibin.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-01 17:35
 */
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){

        Payment payment = paymentService.getPaymentById(id);

        if(payment != null){
            return new CommonResult(200, "查询成功！", payment);
        } else {
            return new CommonResult(400, "查询失败！");
        }

    }

    @RequestMapping("/payment/add")
    public CommonResult add(@RequestBody Payment payment){

        int result = paymentService.add(payment);

        if(result > 0){
            return new CommonResult(200, "添加成功！", payment);
        } else {
            return new CommonResult(400, "添加失败！");
        }

    }
}
