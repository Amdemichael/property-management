package com.amde.propertymanagement.controller;

import com.amde.propertymanagement.dto.CalculatorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/calculator")
public class CalculatorController {

    @GetMapping("/add")
    public Double add(@RequestParam(name = "num1") Double num1, @RequestParam("num2") Double num2){
        return num1 + num2;
    }

    @GetMapping("/sub/{num1}/{num2}")
    public Double sub(@PathVariable Double num1,@PathVariable Double num2){
        return num1 - num2;
    }

    @PostMapping("/multiply")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDto calculatorDto){
        Double result = calculatorDto.getNum1() * calculatorDto.getNum2() *
                calculatorDto.getNum3() * calculatorDto.getNum4();

        ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(result, HttpStatus.CREATED);
        return responseEntity;
    }
}
