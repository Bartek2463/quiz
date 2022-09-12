package com.example.quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Getter
public class HealthCheckDto {
    private boolean status;
    private String message;



}
