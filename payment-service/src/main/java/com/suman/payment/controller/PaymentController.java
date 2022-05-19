package com.suman.payment.controller;

import com.suman.payment.entity.Payment;
import com.suman.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@Slf4j
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping("/")
    public Payment savePayment(@RequestBody Payment payment){
        log.info("Inside savePayment method of PaymentController ");
        return paymentService.savePayment(payment);
    }
    @GetMapping("/{id}")
    public Payment findPaymentById(@PathVariable("id") Long paymentId){
        log.info("Inside findPaymentById method of PaymentController");
        return paymentService.findPaymentById(paymentId);
    }
}




