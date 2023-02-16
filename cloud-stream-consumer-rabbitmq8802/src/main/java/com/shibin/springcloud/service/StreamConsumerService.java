package com.shibin.springcloud.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-10 11:44
 */
@Component
@EnableBinding(Sink.class)
public class StreamConsumerService {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费者8802接收到消息：" + message.getPayload());
    }

}
