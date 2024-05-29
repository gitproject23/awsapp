package com.soft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

    @GetMapping("/")
    public String showData(){

        return "welcome to AWS Services";
    }

}


