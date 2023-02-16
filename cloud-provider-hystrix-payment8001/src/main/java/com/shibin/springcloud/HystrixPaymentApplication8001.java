package com.shibin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-08 14:15
 */
@SpringBootApplication
@EnableEurekaClient
public class HystrixPaymentApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixPaymentApplication8001.class, args);
    }
}
