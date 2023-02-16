package com.shibin.cloudalibaba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-14 09:21
 */
@RestController
@RequestMapping("/sentinel")
public class SentinelController {

    @RequestMapping("/testA")
    public String testA(){
        return "testA";
    }

    @RequestMapping("/testB")
    public String testB(){
        return "testB";
    }
}
