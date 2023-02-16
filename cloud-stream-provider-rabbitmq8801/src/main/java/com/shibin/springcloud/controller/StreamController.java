package com.shibin.springcloud.controller;

import com.shibin.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-10 11:13
 */
@RestController
@RequestMapping("/stream")
public class StreamController {

    @Autowired
    private IMessageProvider iMessageProvider;

    @RequestMapping("/sendMsg")
    public String sendMsg(){
        return iMessageProvider.send();
    }
}
