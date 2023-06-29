package com.example.payment_demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@Slf4j
public class PaymentController {
    @GetMapping("/payment/demo")
    public String hello(@RequestParam String gid, @RequestParam String acid, @RequestParam String rst) {
        log.info("Calling.....");
        log.info("payment: gid={}, acid={}, rst={}", gid, acid, rst);
        return "This is demo payment";
    }
}
