package com.suman.payment.service;

import com.suman.payment.entity.Payment;
import com.suman.payment.repository.PaymentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PaymentService  {

    public Payment addPayment(Payment payment);

    public Payment getPaymentById(Long id);

    List<Payment> getAllPayments();

    }




