package com.gateway.api_gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    
    @GetMapping("/quizServiceFallback")
     public String quizServiceFallback(){
        return "Quiz Service is down at this time !!";
     }

     @GetMapping("/questionServiceFallback")
     public String questionServiceFallback(){
        return "Quiz question is down at this time !!";
     }
}
