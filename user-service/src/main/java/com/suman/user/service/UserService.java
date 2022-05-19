package com.suman.user.service;

import com.suman.user.VO.Department;
import com.suman.user.VO.Payment;
import com.suman.user.VO.ResponseTemplateVO;
import com.suman.user.entity.User;
import com.suman.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;


    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithPayment(Long userId) {
        log.info("Inside getUserWithPayment of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);

        Payment payment =
                restTemplate.getForObject("http://localhost:8080/payments/" + user.getPaymentId()
                        ,Payment.class);

        vo.setUser(user);
        vo.setPayment(payment);

        return  vo;
    }
    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);

        Department department =
                restTemplate.getForObject("http://localhost:8082/departments/" + user.getDepartmentId()
                        ,Department.class);

        vo.setUser(user);
        vo.setDepartment(department);

        return  vo;
    }
}