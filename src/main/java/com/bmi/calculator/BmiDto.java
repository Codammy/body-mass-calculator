package com.bmi.calculator;

import lombok.AllArgsConstructor;;
import lombok.Value;

@AllArgsConstructor
@Value
public class BmiDto {
    Integer weightInKilogram;
    Integer heightInMeter;
}
