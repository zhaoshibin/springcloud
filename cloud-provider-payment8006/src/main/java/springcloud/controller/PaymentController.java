package springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-03 15:13
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/consul")
    public String paymentConsul(){
        return "springcloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }

    @RequestMapping("/testTimeOut")
    public String testTimeOut() throws InterruptedException {
        Thread.sleep(3000);
        return "testTimeOut with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
