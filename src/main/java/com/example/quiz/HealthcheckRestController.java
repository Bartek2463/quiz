package com.example.quiz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/helath")
public class HealthcheckRestController {

    @GetMapping
    public String healthcheck(){
        return "It'working";
    }
}
