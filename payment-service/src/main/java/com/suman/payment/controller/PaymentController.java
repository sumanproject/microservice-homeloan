package com.suman.payment.controller;

import com.suman.payment.entity.Payment;
import com.suman.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")

public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping("/addPayment")
    public Payment addPayment(@RequestBody Payment payment){
        return paymentService.addPayment(payment);
    }

    @GetMapping("/payments")
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }
    @GetMapping("/payment/{id}")
    public Payment getPaymentById(@PathVariable("id") Long id){

        return paymentService.getPaymentById(id);
    }
}
