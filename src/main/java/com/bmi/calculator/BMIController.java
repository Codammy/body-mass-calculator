package com.bmi.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class BMIController {

    @GetMapping("bmi")
    public ResponseEntity<Object> getBMI(@RequestBody BmiDto bmiDto) {
        Double BMI = (bmiDto.getWeightInKilogram() / Math.pow(bmiDto.getHeightInMeter(), 2));
        return new ResponseEntity<>(new BmiResponse(BMI, "Kg/m2"), HttpStatus.OK);
    }
}
