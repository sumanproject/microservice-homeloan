package com.suman.user.controller;

import com.suman.user.VO.ResponseTemplateVO;
import com.suman.user.entity.User;
import com.suman.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithPayment(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithPayment of UserController");
        return userService.getUserWithPayment(userId);
    }

    @GetMapping("/{id}/dept")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }
    @GetMapping("details/{id}")
    public User getUserById(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithPayment of UserController");
        return userService.getUserById(userId);
    }


}