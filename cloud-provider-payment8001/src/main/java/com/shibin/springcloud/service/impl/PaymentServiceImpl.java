package com.shibin.springcloud.service.impl;

import com.shibin.springcloud.dao.PaymentDao;
import com.shibin.springcloud.entity.Payment;
import com.shibin.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhaoshibin
 * @Description TODO
 * @date 2023-02-01 17:37
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public int add(Payment payment) {
        return paymentDao.add(payment);
    }
}
