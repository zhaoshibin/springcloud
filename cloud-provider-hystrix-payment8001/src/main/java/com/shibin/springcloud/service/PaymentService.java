package com.shibin.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-08 14:17
 */
@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id){
        return "线程池： " + Thread.currentThread().getName() + "       paymentInfo_Id: " + id;
    }

    public String paymentInfo_timeOut(Integer id){
        int timeNum = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池： " + Thread.currentThread().getName() + "       耗时" + timeNum + "秒钟 paymentInfo_Id: " + id;
    }
}
