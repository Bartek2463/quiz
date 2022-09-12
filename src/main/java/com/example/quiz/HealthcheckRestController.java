package com.example.quiz;

import com.example.quiz.dto.HealthCheckDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/helath")
public class HealthcheckRestController {

    @GetMapping
   public HealthCheckDto healthCheck(){
        HealthCheckDto dto = new HealthCheckDto(true,"Working now");
        return dto;
    }

}
