package com.amde.propertymanagement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculatorDto {
    @JsonProperty("num")
    private Double num1;
    private Double num2;

    private Double num3;

    private Double num4;

}
