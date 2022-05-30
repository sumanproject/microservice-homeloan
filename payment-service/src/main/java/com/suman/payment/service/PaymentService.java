package com.suman.payment.service;

import com.suman.payment.entity.Payment;

import java.util.List;


public interface PaymentService  {

    public Payment addPayment(Payment payment);

    public Payment getPaymentById(Long id);

    List<Payment> getAllPayments();

    }




