package com.demo.mymicroservice.controller;

import com.demo.mymicroservice.model.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations()
    {
        return new LimitConfiguration(1000, 1);
    }
}
