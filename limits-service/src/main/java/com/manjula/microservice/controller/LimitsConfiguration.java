package com.manjula.microservice.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data @AllArgsConstructor @Builder
public class LimitsConfiguration {

    private int minimum;
    private int maximum;

}
