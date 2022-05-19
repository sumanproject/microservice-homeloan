package com.suman.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Long paymentId;
    private String  paymentUser;
    private double paymentAmount;
    private String paymentMode;
}

