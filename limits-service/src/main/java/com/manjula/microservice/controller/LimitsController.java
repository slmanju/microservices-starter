package com.manjula.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private Limits limits;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimits() {
        return LimitsConfiguration.builder()
                .minimum(limits.getMinimum())
                .maximum(limits.getMaximum())
                .build();
    }

    @Autowired
    public void setLimits(Limits limits) {
        this.limits = limits;
    }

}
