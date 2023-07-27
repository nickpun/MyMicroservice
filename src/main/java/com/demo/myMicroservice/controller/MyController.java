package com.demo.myMicroservice.controller;

import com.demo.myMicroservice.configuration.Configuration;
import com.demo.myMicroservice.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations()
    {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
