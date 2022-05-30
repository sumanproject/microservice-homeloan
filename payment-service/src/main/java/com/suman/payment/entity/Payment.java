package com.suman.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanAccontId;
    private String bankName;
    private Long loanAccNo;
    private String  customerName;
    private double amount;
    private String modeOfPayment;
    private String ifscCode;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date transactionDate_And_Time;
    @PrePersist
    private void onCreate(){
        transactionDate_And_Time = new Date();
    }

}
