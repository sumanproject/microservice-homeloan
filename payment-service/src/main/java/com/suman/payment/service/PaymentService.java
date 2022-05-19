package com.suman.payment.service;

import com.suman.payment.entity.Payment;
import com.suman.payment.repository.PaymentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment) {
        log.info("Inside savePayment of PaymentService");
        return paymentRepository.save(payment);
    }

    public Payment findPaymentById(Long paymentId) {
        log.info("Inside findPaymentById  of PaymentService");
        return paymentRepository.findPaymentById(paymentId);

    }

}



