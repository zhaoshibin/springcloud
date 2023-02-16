package com.shibin.springcloud.service;

import com.shibin.springcloud.entity.Payment;

public interface PaymentService {
    Payment getPaymentById(Long id);

    int add(Payment payment);
}
