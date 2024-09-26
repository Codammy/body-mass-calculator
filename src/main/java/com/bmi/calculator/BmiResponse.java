package com.bmi.calculator;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class BmiResponse {
    Double bmi;
    String unit;
}
