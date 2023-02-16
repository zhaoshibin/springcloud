package com.shibin.springcloud.dao;

import com.shibin.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {

    Payment getPaymentById(Long id);

    int add(Payment payment);
}
