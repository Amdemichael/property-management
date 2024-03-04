package com.amde.propertymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/calculator")
public class CalculatorController {

    @GetMapping("/add")
    public Double add(Double num1, Double num2){
        return num1 + num2;
    }
}
